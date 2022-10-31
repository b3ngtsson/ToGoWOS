package com.example.togowos;

import java.util.TimerTask;

public class MyTokenThread extends TimerTask {
    private TokenThread tokenThread;

    public MyTokenThread(TokenThread tokenThread) {
        this.tokenThread = tokenThread;
    }

    @Override
    public void run() {
        getthistoken();
    }

    public String getthistoken() {
        return tokenThread.getToken();
    }
}
