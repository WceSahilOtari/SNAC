package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class bmi extends AppCompatActivity {
    EditText weightEditText , heightEditText ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        weightEditText = findViewById(R.id.weightEditText) ;
        heightEditText = findViewById(R.id.heightEditText) ;
    }

    public void confirmBMI(View view)
    {
        SharedPreferences bmiSharedPreferences = this.getSharedPreferences("com.example.prana" , MODE_PRIVATE) ;
        if (!weightEditText.getText().toString().equals("") && weightEditText.getText() != null)
            bmiSharedPreferences.edit().putFloat("weight" , Float.parseFloat(weightEditText.getText().toString())).apply();
        if (!heightEditText.getText().toString().equals("") && heightEditText.getText() != null)
            bmiSharedPreferences.edit().putFloat("height" , Float.parseFloat(heightEditText.getText().toString())).apply();

        finish();
    }

}