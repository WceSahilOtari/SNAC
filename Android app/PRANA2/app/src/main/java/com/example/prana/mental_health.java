package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mental_health extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_health);
    }

    public void gotoMeditation(View view)
    {
          Intent intent = new Intent(getApplicationContext() , meditation.class) ;
          startActivity(intent);
    }

    public void gotoMusic(View view)
    {
        Intent intent = new Intent(getApplicationContext(), music_categories.class) ;
        startActivity(intent) ;
    }

    public void gotoMotivationalQuotes(View view)
    {
         Intent intent = new Intent(getApplicationContext() , motivational_quotes.class) ;
         startActivity(intent);
    }
}