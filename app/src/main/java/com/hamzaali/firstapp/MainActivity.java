package com.hamzaali.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.lang.String;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Spider (View view){
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.blackspider);
        Button button = findViewById(R.id.button);
        button.setText("You got the symbiote");
    }




}