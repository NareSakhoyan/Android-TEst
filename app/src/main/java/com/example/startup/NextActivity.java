package com.example.startup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class NextActivity extends AppCompatActivity {

    private final String TAG = "----------------------------";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

//        nameField.setText(name)
        Log.d(TAG, name );
    }
}