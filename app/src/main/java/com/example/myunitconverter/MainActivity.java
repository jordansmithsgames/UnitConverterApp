package com.example.myunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openLengthConverter(View view) {
        Intent myIntent = new Intent(getBaseContext(), LengthActivity.class);
        this.startActivity(myIntent);
    }

    public void openWeightConverter(View view) {
        Intent myIntent = new Intent(getBaseContext(), WeightActivity.class);
        this.startActivity(myIntent);
    }

    public void openTemperatureConverter(View view) {
        Intent myIntent = new Intent(getBaseContext(), TemperatureActivity.class);
        this.startActivity(myIntent);
    }
}