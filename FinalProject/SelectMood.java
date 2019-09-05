package com.example.au_finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectMood extends AppCompatActivity {

    private Button mMood1, mMood2, mMood3, mMood4, mMood5, mMood6, mMood7, mMood8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mood);

        mMood1= (Button)findViewById(R.id.mood1);
        mMood2= (Button)findViewById(R.id.mood2);
        mMood3= (Button)findViewById(R.id.mood3);
        mMood4= (Button)findViewById(R.id.mood4);
        mMood5= (Button)findViewById(R.id.mood5);
        mMood6= (Button)findViewById(R.id.mood6);
        mMood7= (Button)findViewById(R.id.mood7);
        mMood8= (Button)findViewById(R.id.mood8);

        mMood1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SelectMood.this, Quotes.class);
                i.putExtra("Mood", 1);
                startActivity(i);
            }
        });


        mMood2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SelectMood.this, Quotes.class);
                i.putExtra("Mood", 2);
                startActivity(i);
            }
        });

        mMood3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SelectMood.this, Quotes.class);
                i.putExtra("Mood", 3);
                startActivity(i);
            }
        });

        mMood4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SelectMood.this, Quotes.class);
                i.putExtra("Mood", 4);
                startActivity(i);
            }
        });

        mMood5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SelectMood.this, Quotes.class);
                i.putExtra("Mood", 5);
                startActivity(i);
            }
        });

        mMood6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SelectMood.this, Quotes.class);
                i.putExtra("Mood", 6);
                startActivity(i);
            }
        });

        mMood7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SelectMood.this, Quotes.class);
                i.putExtra("Mood", 7);
                startActivity(i);
            }
        });
        mMood8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SelectMood.this, Quotes.class);
                i.putExtra("Mood", 8);
                startActivity(i);
            }
        });


    }
}
