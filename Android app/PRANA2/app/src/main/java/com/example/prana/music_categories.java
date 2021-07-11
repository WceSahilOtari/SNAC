package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class music_categories extends AppCompatActivity
{
    String playList[] = {
            "https://www.youtube.com/playlist?list=PLIubsYwE7HqNYr5dU-hI46VIp1tku8_HU" ,
            "https://www.youtube.com/playlist?list=PLIubsYwE7HqPvN2cIrEHXPF1UDwOSolhs" ,

            "https://www.youtube.com/playlist?list=PLIubsYwE7HqMeel0OVyCCDUjQa_EezTvU" ,
            "https://www.youtube.com/playlist?list=PLIubsYwE7HqP6hbXbzlyHe5SGhJ3GN_OQ" ,
     } ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_categories);
    }

    public void goToPlayList(View view)
    {
        Intent intent = new Intent(getApplicationContext() , playList.class) ;
        int pos = Integer.parseInt(view.getTag().toString()) - 1 ;
        intent.putExtra("url" , playList[pos]) ;
        startActivity(intent);
    }
}