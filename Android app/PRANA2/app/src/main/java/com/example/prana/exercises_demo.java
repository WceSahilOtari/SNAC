package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class exercises_demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises_demo);
        Intent intent = getIntent() ;
        ImageView imageView = findViewById(R.id.demoImage);
        Glide.with(this).load(exercises.demoURL.get(intent.getIntExtra("pos" , 0))).into(imageView);
    }
}