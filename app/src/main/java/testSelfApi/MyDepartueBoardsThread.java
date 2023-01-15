package testSelfApi;

import com.example.togowos.model.Departure;

import java.util.ArrayList;

public class MyDepartueBoardsThread implements Runnable {
    private DepartueBoardsThread departueBoardsThread;

    public MyDepartueBoardsThread(DepartueBoardsThread departueBoardsThread) {
        this.departueBoardsThread = departueBoardsThread;
    }

    @Override
    public void run() {
        getThisListOfDepartureBoards();
    }

    public ArrayList<ArrayList<Departure>> getThisListOfDepartureBoards() {
        return departueBoardsThread.getDepartureBoards();
    }

}
