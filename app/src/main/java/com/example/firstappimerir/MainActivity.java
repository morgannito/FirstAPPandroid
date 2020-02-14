package com.example.firstappimerir;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText mInputText;
    EditText mOutputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInputText = findViewById(R.id.temperature);
        mOutputText = findViewById(R.id.faratruc);

        Button ConvertBtn = findViewById(R.id.buttonConvertir);

        ConvertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });
    }

    void convert() {
        String input = mInputText.getText().toString();
        try {
            float inputValue = Float.parseFloat(input);
            float outputValue = inputValue * 1.8f + 32;
            String output = String.format("%.2f", outputValue);
            mOutputText.setText(output);
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
    }
}
