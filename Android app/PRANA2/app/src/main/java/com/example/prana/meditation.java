package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class meditation extends AppCompatActivity
{
    YouTubePlayerView video1 , video2 , video3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
        video1 = findViewById(R.id.video1) ;
        video2 = findViewById(R.id.video2) ;
        video3 = findViewById(R.id.video3) ;
        getLifecycle().addObserver(video1);
        getLifecycle().addObserver(video2);
        getLifecycle().addObserver(video3);
   }
}