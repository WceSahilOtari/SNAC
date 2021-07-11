package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView mentalHealthImage , physicalFitnessImage , toDoListImage , chatImage;
    TextView mentalHealthTextView , physicalFitnessTextView , toDoListTextView , chatTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mentalHealthImage = findViewById(R.id.mentalHealthImage) ;
        physicalFitnessImage = findViewById(R.id.physicalFitnessImage );
        toDoListImage = findViewById(R.id.toDoListImage);
        chatImage = findViewById(R.id.chatImage) ;
        mentalHealthTextView = findViewById(R.id.mentalHealthTextView) ;
        physicalFitnessTextView = findViewById(R.id.physicalFitnessTextView) ;
        toDoListTextView = findViewById(R.id.toDoListTextView) ;
        chatTextView = findViewById(R.id.chatTextView) ;

        mentalHealthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , mental_health.class) ;
                startActivity(intent);
            }
        });
        mentalHealthTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , mental_health.class) ;
                startActivity(intent);
            }
        });

        physicalFitnessImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , physical_health.class) ;
                startActivity(intent);
            }
        });

        physicalFitnessTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , physical_health.class) ;
                startActivity(intent);
            }
        });


        toDoListImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , to_do_list.class) ;
                startActivity(intent);
            }
        });
        toDoListTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , to_do_list.class) ;
                startActivity(intent);
            }
        });

        chatImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   Intent intent = new Intent(getApplicationContext() , chat.class) ;
                   startActivity(intent);
            }
        });
        chatTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , chat.class) ;
                startActivity(intent);
            }
        });
    }

}