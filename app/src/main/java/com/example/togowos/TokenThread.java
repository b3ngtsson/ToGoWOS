package com.example.togowos;

import com.example.togowos.auth.TokenAPI;

import java.io.IOException;
import java.net.MalformedURLException;

public class TokenThread implements Runnable {

    private String token;

    @Override
    public void run() {
        try {
            TokenAPI tokenapi = new TokenAPI();
            token = tokenapi.getAccessToken("am_application_scope default");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getToken() {
        return this.token;
    }
}
