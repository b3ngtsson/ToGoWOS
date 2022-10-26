package com.example.togowos;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.togowos.databinding.ActivityMainBinding;
import com.example.togowos.Api.ArrivalBoardApi;
import com.example.togowos.model.ArrivalBoard;

import org.threeten.bp.LocalDate;


public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;


    }
}