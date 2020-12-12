package com.example.startup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText name;
    private EditText password;
    private final String TAG = "This is my log: ";
    private Button myBtn;
    private boolean loading = true;
    private ImageView fruitImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        myBtn = findViewById(R.id.submit);
        myBtn.setOnClickListener(this);

        fruitImageView = findViewById(R.id.fruit);



        myBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        myBtn.setOnClickListener(this);

        Log.d(TAG, getData());
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.loading = false;
        Log.d(TAG, "Application is starting");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "application is onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Application is onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Application is onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "application is onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "application is onDestroy: ");
    }

    public String getData() {
        String name = this.name.getText().toString();
        String password = this.password.getText().toString();
        return "name" + ": " + name + "\n" + "password"+": " + password + "\n";
    }

    @Override
    public void onClick(View v) {
        if (v.equals(myBtn)) {
            Log.d(TAG, this.getData());
            int id = getResources().getIdentifier("com.example.startup:drawable/way", null, null);
            fruitImageView.setImageResource(id);

//            Intent intent = new Intent(this, NextActivity.class);
//            String value = "Nare1111111111";
//            intent.putExtra("name", value);
//            intent.putExtra("email", emailValue);
//            intent.putExtra("phone", phoneValue);
//            startActivity(intent);
//            connectDB.insert(name, password);
        }
    }



}