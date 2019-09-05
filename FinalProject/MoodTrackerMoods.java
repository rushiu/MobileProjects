package com.example.au_finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MoodTrackerMoods extends AppCompatActivity {
    private Button mMood1, mMood2, mMood3, mMood4, mMood5, mMood6, mMood7, mMood8;

    private FirebaseDatabase database;
    private DatabaseReference myRef;

    private int mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_tracker_moods);

        mDay = getIntent().getIntExtra("Day", 0);

        mMood1= (Button)findViewById(R.id.mood1);
        mMood2= (Button)findViewById(R.id.mood2);
        mMood3= (Button)findViewById(R.id.mood3);
        mMood4= (Button)findViewById(R.id.mood4);
        mMood5= (Button)findViewById(R.id.mood5);
        mMood6= (Button)findViewById(R.id.mood6);
        mMood7= (Button)findViewById(R.id.mood7);
        mMood8= (Button)findViewById(R.id.mood8);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("day"+mDay);

        mMood1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myRef.setValue("Upset");
            }
        });


        mMood2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.setValue("Unmotivated");

            }
        });

        mMood3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.setValue("Stressed");

            }
        });

        mMood4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.setValue("Gloomy");

            }
        });

        mMood5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.setValue("Tense");

            }
        });

        mMood6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.setValue("Irritated");

            }
        });

        mMood7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.setValue("Tired");

            }
        });
        mMood8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.setValue("Grief");

            }
        });
    }
}
