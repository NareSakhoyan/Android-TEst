package com.example.startup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText name;
    private EditText password;
    private final String TAG = "This is my log: ";
    private Button myBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        myBtn = findViewById(R.id.submit);

        myBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        myBtn.setOnClickListener(this);


        Log.d(TAG, getData());
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
            Intent intent = new Intent(this, NextActivity.class);
//            String value = "Nare1111111111";
//            intent.putExtra("name", value);
//            intent.putExtra("email", emailValue);
//            intent.putExtra("phone", phoneValue);
            startActivity(intent);
//            connectDB.insert(name, password);
        }
    }
}