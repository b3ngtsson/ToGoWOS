package testSelfApi;

import com.example.togowos.ApiException;
import com.example.togowos.model.Departure;
import com.example.togowos.model.LocationList;

import org.json.JSONException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class DepartueBoardsThread implements Runnable{
    private final DepartueBoardsApi api = new DepartueBoardsApi();
    private LocationList locationList;
    private ArrayList<ArrayList<Departure>> DepartureBoards;

    public DepartueBoardsThread(LocationList stops) throws MalformedURLException {
        this.locationList = stops;
    }

    @Override
    public void run() {
        try {
            loadStopsID(locationList);

        } catch (Exception e) {
            System.out.print(e);
            // ppp
        }
    }

    private void LoadDepartureBoards(LocationList stops) throws ApiException, IOException, JSONException{
        ArrayList<ArrayList<Departure>> response = api.getDepartureBoards(
                stops
        );
        DepartureBoards = response;

    }


    private void loadStopsID(LocationList stops) throws ApiException, IOException, JSONException {

        ArrayList<ArrayList<Departure>> response = api.getDepartureBoards(
                stops);
        DepartureBoards = response;
    }

    public ArrayList<ArrayList<Departure>> getDepartureBoards() {
        return this.DepartureBoards;
    }

}

