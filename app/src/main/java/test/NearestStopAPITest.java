package test;

import com.example.togowos.Api.LocationApi;
import com.example.togowos.ApiClient;
import com.example.togowos.auth.TokenAPI;
import com.example.togowos.model.LocationList;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class NearestStopAPITest {

    private final LocationApi api = new LocationApi();
    private ApiClient aC = new ApiClient();

    @Before
    public void setUp() throws IOException {
        aC = api.getApiClient();

       if(aC.getAuthentication("am_application_scope default") == null) {
            //create key by calling POST: https://api.vasttrafik.se/token
            String acess_token = getToken("am_application_scope default");
           // return expire_time ? who you may ask, no one cares.
           // ALSO GET ACCESS_TOKEN, wil lbe set for 3600s == 1 hour

           // Set aC.setAccessToken(String access_token);
           aC.setAccessToken(acess_token);
       }

    }

    private String getToken(String client_id) throws IOException {
        TokenAPI tokenApi = new TokenAPI();
        return tokenApi.getAccessToken(client_id);
    }


    /**
     * Returns a list of all stops available in the journey planner.
     *
     * Returns a list of all stops available in the journey planner. Be aware that a call of this service is very time consuming and should be only requested when it is really needed.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllStopsTest() throws Exception {
        String format = null;
        String jsonpCallback = null;
        LocationList response = api.getAllStops(format, jsonpCallback);

        // TODO: test validations
    }

    /**
     * Returns a list of possible matches in the journey planner database
     *
     * Performs a pattern matching of a user input to retrieve a list of possible matches in the journey planner database. Possible matches might be stops/stations, points of interest and addresses.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLocationByNameTest() throws Exception {
        String input = null;
        String format = null;
        String jsonpCallback = null;
        LocationList response = api.getLocationByName(input, format, jsonpCallback);

        // TODO: test validations
    }

    /**
     * Returns the address nearest a given coordinate.
     *
     *
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNearbyAddressTest() throws Exception {
        Double originCoordLat = null;
        Double originCoordLong = null;
        String format = null;
        String jsonpCallback = null;
        LocationList response = api.getNearbyAddress(originCoordLat, originCoordLong, format, jsonpCallback);

        // TODO: test validations
    }

    /**
     * Returns a list of stops around a given center coordinate.
     *
     * Returns a list of stops around a given center coordinate. The returned results are ordered by their distance to the center coordinate.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNearbyStopsTest() throws Exception {

        Double originCoordLat = 57.71273046980082;
        Double originCoordLong = 12.010236130210593;
        Integer maxNo = 30;
        Integer maxDist = 15;
        String format = null;
        String jsonpCallback = null;
        LocationList response = api.getNearbyStops(originCoordLat, originCoordLong, maxNo, maxDist, format, jsonpCallback);

        // TODO: test validations
    }
}
