package com.example.togowos;


import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.togowos.Adapter.ListAdapter;
import com.example.togowos.auth.HttpBasicAuth;
import com.example.togowos.auth.OAuth;
import com.example.togowos.databinding.ActivityMainBinding;
import com.example.togowos.model.Departure;
import com.example.togowos.model.LocationList;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import testSelfApi.DepartueBoardsThread;
import testSelfApi.MyDepartueBoardsThread;
import testSelfApi.MyNearestStopIdThread;
import testSelfApi.NearestStopIDThread;


public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;
    public static HttpBasicAuth httpBasicAuth = new HttpBasicAuth();
    public static OAuth token = new OAuth();
    public static ApiClient apiclient;
    static Logger logger = Logger.getLogger(MainActivity.class.getName());
    public static ArrayList<ArrayList<Departure>> departureboard = new ArrayList<>();
    private final int REQUEST_PERMISSION_PHONE_STATE=1;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = getApplicationContext();



    }

    public void sendMessage(View view){
        // View mainPage = new View(this);
        // Button title = mainPage.findViewById(R.id.button_send);
        startProgram();
    }

    public void startProgram(){
        // first authentication
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //request permissions
        showPhoneStatePermission();

        // setup apiclient and token for authentication
        configureStart();

        // get data such as lat long
        Map<String, Double> coordinates = getCoordinates();
        loadData(coordinates);

        ArrayList<Departure> soloboard = new ArrayList<>();
        Optional<ArrayList<Departure>> soloboards =  departureboard.stream().findFirst();
        if(soloboards.isPresent()){
            soloboard = soloboards.get();
        }

        ListAdapter listAdapter = new ListAdapter(MainActivity.this,soloboard);

        binding.listView.setAdapter(listAdapter);
    }

    public void configureStart(){
        // set ApiClient with authorization we can use for every type of API.
        apiclient = new ApiClient("oAuth", token);
        Configuration.setDefaultApiClient(apiclient);

        try {
            getToken();
        }
        catch (Exception e){
            logger.info("Could not get token for authenthication, refresh" + e.getMessage());
        }
    }

    public void loadData(Map<String, Double> coordinates){
        try{
            LocationList  stops = getNearbyStopID(coordinates.get("lat"), coordinates.get("long"));
            try{
                ArrayList<ArrayList<Departure>> departureboards = getDepartureBoards(stops);
                logger.info("retrived departureboards for " + departureboards.size() + " locations");
                departureboard = departureboards;

            }
            catch(Exception e){
                logger.info("Failed to get departure boards");

            }
        }catch (Exception e){
            logger.info("Failed to find nearby bussstops");
        }
    }
    public ArrayList<ArrayList<Departure>> getDepartureBoards(LocationList stops) throws InterruptedException, MalformedURLException{
        DepartueBoardsThread departueBoardsThread = new DepartueBoardsThread(stops);
        Thread t = new Thread(departueBoardsThread);
        t.start();
        t.join();

        MyDepartueBoardsThread mytask = new MyDepartueBoardsThread(departueBoardsThread);

        return mytask.getThisListOfDepartureBoards();
    }


    public LocationList getNearestStops(Double lat, Double lon) throws InterruptedException, MalformedURLException {

        NearestStopThread nearestStopThread = new NearestStopThread(lat, lon);
        Thread t = new Thread(nearestStopThread);
        t.start();
        t.join();


        MyNearestStopThread mytask = new MyNearestStopThread(nearestStopThread);

        return mytask.getThisListOfStops();
    }

    public LocationList getNearbyStopID(Double lat, Double lon) throws InterruptedException, MalformedURLException {
        NearestStopIDThread nearestStopIDThread = new NearestStopIDThread(lat, lon);
        Thread t = new Thread(nearestStopIDThread);
        t.start();
        t.join();


        MyNearestStopIdThread mytask = new MyNearestStopIdThread(nearestStopIDThread);

        return mytask.getThisListOfStops();
    }

    private Location getLastKnownLocation(){
        LocationManager mLocationManager = (LocationManager)getApplicationContext().getSystemService(LOCATION_SERVICE);

        List<String> providers = mLocationManager.getProviders(true);
        Location bestLocation = null;
        for(String provider: providers){
            @SuppressLint("MissingPermission") Location i = mLocationManager.getLastKnownLocation(provider);
            if(i == null){
                continue;
            }
            if(bestLocation == null || i.getAccuracy() < bestLocation.getAccuracy()){
                bestLocation = i;
            }
        }
        return bestLocation;
    }

    public Map<String, Double> getCoordinates() {

        Map<String, Double> coordinates = new HashMap<>();
        Location location = getLastKnownLocation();


        LocationManager lm = (LocationManager) mContext.getSystemService(mContext.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
           // if (!canAccessLocation() || !canAccessContacts()) {
             //   requestPermissions( permissions, Manifest.permission.ACCESS_FINE_LOCATION);
            //}
            return null;

        }
        Location local = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        double longitude = local.getLongitude();
        double latitude = local.getLatitude();
        coordinates.put("lat", latitude);
        coordinates.put("long", longitude);

        return coordinates;
    }

    public void getToken() throws InterruptedException {
        //CompletableFuture<String> completableFuture = new CompletableFuture<>();

        httpBasicAuth.setUsername("JvCUv2Q8QTu8SzpKlNR6tGF_AdMa");
        httpBasicAuth.setPassword("sZWu5IIbvxtU7lkc0XX25khsHyoa");


        TokenThread tokenThread = new TokenThread();
        Thread t = new Thread(tokenThread);
        t.start();
        t.join();

        MyTokenThread mytask = new MyTokenThread(tokenThread);
        token.setAccessToken(mytask.getthistoken());
        // completableFuture.complete(mytask.getthistoken());
        //String result = completableFuture.get();

    }

    @Override
    public void onRequestPermissionsResult(
            int requestCode,
            String permissions[],
            int[] grantResults) {
        switch (requestCode) {
            case REQUEST_PERMISSION_PHONE_STATE:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(MainActivity.this, "Permission Granted!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Permission Denied!", Toast.LENGTH_SHORT).show();
                }
        }
    }

    private void showExplanation(String title,
                                 String message,
                                 final String permission,
                                 final int permissionRequestCode) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        requestPermission(permission, permissionRequestCode);
                    }
                });
        builder.create().show();
    }

    private void requestPermission(String permissionName, int permissionRequestCode) {
        ActivityCompat.requestPermissions(this,
                new String[]{permissionName}, permissionRequestCode);
    }
    private void showPhoneStatePermission() {
        int permissionCheck = ContextCompat.checkSelfPermission(
                this, Manifest.permission.ACCESS_FINE_LOCATION);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {
                showExplanation("Permission Needed", "Rationale", Manifest.permission.ACCESS_FINE_LOCATION, REQUEST_PERMISSION_PHONE_STATE);
            } else {
                requestPermission(Manifest.permission.ACCESS_FINE_LOCATION, REQUEST_PERMISSION_PHONE_STATE);
            }
        } else {
            Toast.makeText(MainActivity.this, "Permission (already) Granted!", Toast.LENGTH_SHORT).show();
        }

        int permissionCheck2 = ContextCompat.checkSelfPermission(
                this, Manifest.permission.ACCESS_COARSE_LOCATION);
        if (permissionCheck2 != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_COARSE_LOCATION)) {
                showExplanation("Permission Needed", "Rationale", Manifest.permission.ACCESS_COARSE_LOCATION, REQUEST_PERMISSION_PHONE_STATE);
            } else {
                requestPermission(Manifest.permission.ACCESS_COARSE_LOCATION, REQUEST_PERMISSION_PHONE_STATE);
            }
        } else {
            Toast.makeText(MainActivity.this, "Permission (already) Granted!", Toast.LENGTH_SHORT).show();
        }

    }
}

