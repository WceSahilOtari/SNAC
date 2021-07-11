package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class physical_health extends AppCompatActivity {
    float bmi = 0 ;
    float height = 0 , weight = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_health);
        SharedPreferences bmiSharedPreferences = this.getSharedPreferences("com.example.prana" , MODE_PRIVATE) ;
        TextView infoTextView = findViewById(R.id.infoTextView) ;

        float weight = bmiSharedPreferences.getFloat("weight" , 0) ;
        float height = (bmiSharedPreferences.getFloat("height" , 0))/100 ;

        if (weight == 0 || height == 0)
            infoTextView.setText("Please update weight and height to get BMI");
        else {
            float bmi = weight/(height*height) ;
            infoTextView.setText("Weight : " + weight + " kg\nHeight : " + height*100 + " cm\nBMI : " + bmi);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences bmiSharedPreferences = this.getSharedPreferences("com.example.prana" , MODE_PRIVATE) ;
        TextView infoTextView = findViewById(R.id.infoTextView) ;

        weight = bmiSharedPreferences.getFloat("weight" , 0) ;
        height = (bmiSharedPreferences.getFloat("height" , 0))/100 ;

        if (weight == 0 || height == 0)
            infoTextView.setText("Please update weight and height to get BMI");
        else {
            bmi = weight/(height*height) ;
            infoTextView.setText("Weight : " + weight + " kg\nHeight : " + height*100 + " cm\nBMI : " + bmi);
        }
    }

    public void gotoUpdateBMI(View view)
    {
        Intent intent = new Intent(getApplicationContext() , bmi.class) ;
        startActivity(intent);
    }


    public void gotoExercises(View view)
    {

        if (bmi == 0 || weight == 0 || height == 0) Toast.makeText(getApplicationContext() , "Please Enter your weight\nand height to get exercise\nby clicking on above\nUpdate info button " , Toast.LENGTH_SHORT).show();

        else {
            Intent intent = new Intent(getApplicationContext() , exercises.class);

            startActivity(intent);
        }
    }
}