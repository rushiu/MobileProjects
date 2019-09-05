package com.example.au_finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MoodTracker extends AppCompatActivity {

    private Button mDay1, mDay2, mDay3, mDay4, mDay5;
    private TextView mDay1M, mDay2M, mDay3M, mDay4M, mDay5M;

    private FirebaseDatabase database;
    private DatabaseReference myRef1, myRef2, myRef3, myRef4, myRef5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_tracker);

        database = FirebaseDatabase.getInstance();
        myRef1 = database.getReference("day1");
        myRef2 = database.getReference("day2");
        myRef3 = database.getReference("day3");
        myRef4 = database.getReference("day4");
        myRef5 = database.getReference("day5");

        mDay1= (Button)findViewById(R.id.day1);
        mDay2= (Button)findViewById(R.id.day2);
        mDay3= (Button)findViewById(R.id.day3);
        mDay4= (Button)findViewById(R.id.day4);
        mDay5= (Button)findViewById(R.id.day5);

        mDay1M= (TextView) findViewById(R.id.day1m);
        mDay2M= (TextView)findViewById(R.id.day2m);
        mDay3M= (TextView)findViewById(R.id.day3m);
        mDay4M= (TextView)findViewById(R.id.day4m);
        mDay5M= (TextView)findViewById(R.id.day5m);

        //get all the existing day's moods

        mDay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MoodTracker.this, MoodTrackerMoods.class);
                i.putExtra("Day", 1);
                startActivity(i);
            }
        });

        mDay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MoodTracker.this, MoodTrackerMoods.class);
                i.putExtra("Day", 2);
                startActivity(i);
            }
        });

        mDay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MoodTracker.this, MoodTrackerMoods.class);
                i.putExtra("Day", 3);
                startActivity(i);
            }
        });

        mDay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MoodTracker.this, MoodTrackerMoods.class);
                i.putExtra("Day", 4);
                startActivity(i);
            }
        });

        mDay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MoodTracker.this, MoodTrackerMoods.class);
                i.putExtra("Day", 5);
                startActivity(i);
            }
        });
        myRef1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                mDay1M.setText(value);
            }
            @Override
            public void onCancelled(DatabaseError error) {
            }
        });

        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                mDay2M.setText(value);
            }
            @Override
            public void onCancelled(DatabaseError error) {
            }
        });

        myRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                mDay3M.setText(value);
            }
            @Override
            public void onCancelled(DatabaseError error) {
            }
        });

        myRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                mDay4M.setText(value);
            }
            @Override
            public void onCancelled(DatabaseError error) {
            }
        });

        myRef5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                mDay5M.setText(value);
            }
            @Override
            public void onCancelled(DatabaseError error) {
            }
        });
    }
}
