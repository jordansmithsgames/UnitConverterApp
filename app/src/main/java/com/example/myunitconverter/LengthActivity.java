package com.example.myunitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LengthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        final Button toFeetButton = findViewById(R.id.toFeetButton);
        final Button toMetersButton = findViewById(R.id.toMeterButton);

        toFeetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert("feet");
            }
        });
        toMetersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert("meters");
            }
        });
    }

    public void convert(String operation) {
        final EditText input = findViewById(R.id.inputUnits);
        final TextView output = findViewById(R.id.outputUnits);

        if (input.getText().length() == 0) return;
        float outputValue = 0;
        String outputText = "";
        if (operation == "feet") {
            outputValue = Float.parseFloat(input.getText().toString()) * 3.28084f;
            outputText = Float.toString(outputValue) + " ft.";
        }
        else if (operation == "meters") {
            outputValue = Float.parseFloat(input.getText().toString()) * 0.3048f;
            outputText = Float.toString(outputValue) + " m";
        }
        output.setText(outputText);
    }
}
