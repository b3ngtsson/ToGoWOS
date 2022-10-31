package com.example.togowos;


import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;

import com.example.togowos.Api.LocationApi;
import com.example.togowos.databinding.ActivityMainBinding;
import com.example.togowos.model.LocationList;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;
    private final LocationApi api = new LocationApi();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // first authentication
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;

        String token = "";



        try {
            token = getToken();
        }
        catch (Exception e){
            //log it out  bro

        }

        // get data such as lat long
        Map<String, Double> coordinates = getCoordinates();

        // 2nd call API with closest stations
        // have to create another Thread
        try{
            LocationList stops = getNearestStops(coordinates.get("lat"), coordinates.get("long"));
        }catch (Exception e){
            //
        }



    }


    public LocationList getNearestStops(Double lat, Double lon){

        NearestStopThread nearestStopThread = new NearestStopThread(lat, lon);
        Thread t = new Thread(nearestStopThread);
        t.start();

        MyNearestStopThread mytask = new MyNearestStopThread(nearestStopThread);

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
        coordinates.put("long", longitude);
        coordinates.put("lat", latitude);
        return coordinates;
    }

    public String getToken() {
        //CompletableFuture<String> completableFuture = new CompletableFuture<>();

        TokenThread tokenThread = new TokenThread();
        Thread t = new Thread(tokenThread);
        t.start();

        MyTokenThread mytask = new MyTokenThread(tokenThread);
        // completableFuture.complete(mytask.getthistoken());
        //String result = completableFuture.get();

        return mytask.getthistoken();

    }
}

