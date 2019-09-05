package com.example.au_finalproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mChooseMood;
    private Button mMoodTracker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChooseMood= (Button)findViewById(R.id.choose_mood);
        mMoodTracker= (Button)findViewById(R.id.mood_tracker);



        ImageView ball = (ImageView) findViewById(R.id.faces);
        AnimationDrawable animation = (AnimationDrawable) ball.getDrawable();
        animation.start();

        mChooseMood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, SelectMood.class);
                startActivity(i);
            }
        });

        mMoodTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, MoodTracker.class);
                startActivity(i);
            }
        });



    }

}
