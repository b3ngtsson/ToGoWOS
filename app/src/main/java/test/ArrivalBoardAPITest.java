package test;

import com.example.togowos.*;
import com.example.togowos.model.*;
import com.example.togowos.Api.ArrivalBoardApi;

import org.junit.Test;
import org.threeten.bp.LocalDate;

public class ArrivalBoardAPITest {

    @Test
    public void useAppContext(){
        ArrivalBoardApi apiInstance = new ArrivalBoardApi();
        Long id = 789L; // Long | stop id
        LocalDate date = LocalDate.now(); // LocalDate | the date
        String time = "time_example"; // String | the time in format HH:MM
        Long direction = 789L; // Long | stop id in order to get only departures of vehicles with a specified direction
        String useVas = "useVas_example"; // String | to exclude trips with Västtågen, set this parameter to 0.
        String useLDTrain = "useLDTrain_example"; // String | to exclude trips with long distance trains, set this parameter to 0.
        String useRegTrain = "useRegTrain_example"; // String | to exclude trips with regional trains, set this parameter to 0.
        String useBus = "useBus_example"; // String | to exclude trips with buses, set this parameter to 0.
        String useBoat = "useBoat_example"; // String | to exclude trips with boats, set this parameter to 0.
        String useTram = "useTram_example"; // String | to exclude trips with trams, set this parameter to 0.
        String excludeDR = "excludeDR_example"; // String | to exclude journeys which require tel. registration, set this parameter to 0.
        Integer timeSpan = 56; // Integer | to get the next departures in a specified timespan of up to 24 hours (unit: minutes). If this parameter is not set, the result will contain the next 20 departures.
        Integer maxDeparturesPerLine = 56; // Integer | if timeSpan is set you can further reduce the number of returned journeys by adding this parameter, which will cause only the given number of journeys for every combination of line and direction.
        String needJourneyDetail = "needJourneyDetail_example"; // String | if the reference URL for the journey detail service is not needed in the result, set this parameter to 0
        String format = "format_example"; // String | the required response format
        String jsonpCallback = "jsonpCallback_example"; // String | If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name.

        try {
            ArrivalBoard result = apiInstance.getArrivalBoard(id, date, time, direction, useVas, useLDTrain, useRegTrain, useBus, useBoat, useTram, excludeDR, timeSpan, maxDeparturesPerLine, needJourneyDetail, format, jsonpCallback);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArrivalBoardApi#getArrivalBoard");
            e.printStackTrace();
        }
    }



}