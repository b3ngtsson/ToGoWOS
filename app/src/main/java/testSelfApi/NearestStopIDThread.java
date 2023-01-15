package testSelfApi;

import com.example.togowos.ApiException;
import com.example.togowos.model.LocationList;

import org.json.JSONException;

import java.io.IOException;
import java.net.MalformedURLException;

public class NearestStopIDThread implements Runnable{

    private final NearestStopAPi api = new NearestStopAPi();
    private LocationList  locationList;
    private Double lon, lat;

    public NearestStopIDThread(Double lat, Double lon) throws MalformedURLException {
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public void run() {
        try {
            loadStopsID(lat, lon);

        } catch (Exception e) {
            System.out.print(e);
            // ppp
        }
    }

    private void loadStopsID(Double lat, Double lon) throws ApiException, IOException, JSONException {

        LocationList response = api.getNearbyStopsID(
                lat,
                lon,
                4,
                null,
                null,
                null);
        locationList = response;
    }

    public LocationList  getStops() {
        return this.locationList;
    }

}

