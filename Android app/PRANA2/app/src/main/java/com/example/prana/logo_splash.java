package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

public class logo_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_logo_splash);

        ImageView logoImageView = findViewById(R.id.logoImageView);
        logoImageView.animate().alpha(1).scaleY(1).scaleX(1).setDuration(5000) ;

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext() ,MainActivity.class) ;
                startActivity(intent);
                finish();
            }
        }.start() ;

    }
}