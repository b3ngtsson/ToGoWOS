package com.example.togowos;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.togowos.databinding.ActivityMainBinding;

public class ApiCredentials{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }


    public ApiCredentials setApiCredentials{
        ApiCredentials new = ApiCredentials(
                ""
        )
    }
    public ApiCredentials(String username, String password){
        this.username = username;
        this.password = password;
    }
}
