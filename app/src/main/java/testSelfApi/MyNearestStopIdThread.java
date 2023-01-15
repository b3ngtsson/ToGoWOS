package testSelfApi;

import com.example.togowos.model.LocationList;

public class MyNearestStopIdThread implements Runnable {
    private NearestStopIDThread nearestStopIDThread;

    public MyNearestStopIdThread(NearestStopIDThread nearestStopIDThread) {
        this.nearestStopIDThread = nearestStopIDThread;
    }

    @Override
    public void run() {
        getThisListOfStops();
    }

    public LocationList getThisListOfStops() {
        return nearestStopIDThread.getStops();
    }
}

