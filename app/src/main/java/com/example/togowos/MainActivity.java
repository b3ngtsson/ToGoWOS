package com.example.togowos;


import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;

import com.example.togowos.auth.HttpBasicAuth;
import com.example.togowos.auth.OAuth;
import com.example.togowos.databinding.ActivityMainBinding;
import com.example.togowos.model.Departure;
import com.example.togowos.model.LocationList;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // first authentication
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;

        // set ApiClient with authorization we can use for every type of API.
        apiclient = new ApiClient("oAuth", token);
        Configuration.setDefaultApiClient(apiclient);

        try {
            getToken();
        }
        catch (Exception e){
            //log it out  bro
        }

        // get data such as lat long
        Map<String, Double> coordinates = getCoordinates();

        // 2nd call API with closest stations
        // have to create another Thread
        try{
            LocationList  stops = getNearbyStopID(coordinates.get("lat"), coordinates.get("long"));
            try{
                ArrayList<ArrayList<Departure>> departureboards = getDepartureBoards(stops);
                System.out.print("lets - go");

            }
            catch(Exception e){
                System.out.print("Failed to get departureboard");

            }
        }catch (Exception e){
            System.out.print("Failed to find nearbyStop");
        }

        // Find the departures from the nearest stops

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


    public Map<String, Double> getCoordinates() {
        Map<String, Double> coordinates = new HashMap<>();
        String[] permissions = new String[3];
        LocationManager lm = (LocationManager) getSystemService(LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
           // if (!canAccessLocation() || !canAccessContacts()) {
             //   requestPermissions( permissions, Manifest.permission.ACCESS_FINE_LOCATION);
            //}
            return null;

        }
        Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        double longitude = location.getLongitude();
        double latitude = location.getLatitude();
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
}

