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

import com.example.togowos.Api.ArrivalBoardApi;

import com.example.togowos.model.ArrivalBoard;
import org.threeten.bp.LocalDate;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArrivalBoardApi
 */
@Ignore
public class ArrivalBoardApiTest {

    private final ArrivalBoardApi api = new ArrivalBoardApi();


    /**
     * Return the next 20 arrivals (or less if not existing) from a given point in time or the next arrivals in a given timespan.
     *
     * This method will return the next 20 arrivals (or less if not existing) from a given point in time or the next arrivals in a given timespan. The service can only be called for stops/stations by using according ID retrieved by the location method. The parameter is called id. The time and date are defined with the parameters date and time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getArrivalBoardTest() throws Exception {
        Long id = null;
        LocalDate date = null;
        String time = null;
        Long direction = null;
        String useVas = null;
        String useLDTrain = null;
        String useRegTrain = null;
        String useBus = null;
        String useBoat = null;
        String useTram = null;
        String excludeDR = null;
        Integer timeSpan = null;
        Integer maxDeparturesPerLine = null;
        String needJourneyDetail = null;
        String format = null;
        String jsonpCallback = null;
        ArrivalBoard response = api.getArrivalBoard(id, date, time, direction, useVas, useLDTrain, useRegTrain, useBus, useBoat, useTram, excludeDR, timeSpan, maxDeparturesPerLine, needJourneyDetail, format, jsonpCallback);

        // TODO: test validations
    }

}