package com.example.togowos;

import com.example.togowos.model.LocationList;

import java.util.TimerTask;

public class MyNearestStopThread extends TimerTask{
    private NearestStopThread nearestStopThread;

    public MyNearestStopThread(NearestStopThread nearestStopThread) {
        this.nearestStopThread = nearestStopThread;
    }

    @Override
    public void run() {
        getThisListOfStops();
    }

    public LocationList getThisListOfStops() {
        return nearestStopThread.getStops();
    }
}

