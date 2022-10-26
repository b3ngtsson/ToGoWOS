/*
 * Reseplaneraren
 * Provides access to Västtrafik journey planner
 *
 * OpenAPI spec version: 1.10.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import com.example.togowos.Api.LocationApi;
import com.example.togowos.model.LocationList;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationApi
 */
@Ignore
public class LocationApiTest {

    private final LocationApi api = new LocationApi();


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
        Double originCoordLat = null;
        Double originCoordLong = null;
        Integer maxNo = null;
        Integer maxDist = null;
        String format = null;
        String jsonpCallback = null;
        LocationList response = api.getNearbyStops(originCoordLat, originCoordLong, maxNo, maxDist, format, jsonpCallback);

        // TODO: test validations
    }

}