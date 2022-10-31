package com.example.togowos;

import com.example.togowos.Api.LocationApi;
import com.example.togowos.model.LocationList;

public class NearestStopThread implements Runnable {

    private final LocationApi api = new LocationApi();
    private LocationList locationList;
    private Double lon, lat;

    public NearestStopThread(Double lat, Double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public void run() {
        try {
            loadStops(lon, lat);

        } catch (Exception e) {
            // aids
        }
    }

    private void loadStops(Double lat, Double lon) throws ApiException {

        LocationList response = api.getNearbyStops(
                lat,
                lon,
                30,
                15,
                null,
                null);
        locationList = response;

    }

    public LocationList getStops() {
        return this.locationList;
    }

}
