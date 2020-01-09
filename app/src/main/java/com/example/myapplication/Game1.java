package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Game1 extends AppCompatActivity {

    Button room1, room2, room3;
    TextView SCORE, TRY;
    int r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);

        room1 = findViewById(R.id.room1);
        room2 = findViewById(R.id.room2);
        room3 = findViewById(R.id.room3);
        SCORE = findViewById(R.id.SCORE);
        TRY = findViewById(R.id.TRY);

        Random rnd = new Random();
        r = rnd.nextInt(3) + 1;
            room1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(r==1) {
                        Intent intent = new Intent(getApplicationContext(), Game2.class);
                        intent.putExtra("rabbit", r);
                        startActivity(intent);
                    } else{
                        Intent intent = new Intent(getApplicationContext(), Game2.class);
                        intent.putExtra("rabbit", 0);
                        startActivity(intent);
                    }
                }
            });

            room2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(r==2) {
                        Intent intent = new Intent(getApplicationContext(), Game2.class);
                        intent.putExtra("rabbit", r);
                        startActivity(intent);
                    } else{
                        Intent intent = new Intent(getApplicationContext(), Game2.class);
                        intent.putExtra("rabbit", 0);
                        startActivity(intent);
                    }
                }
            });

            room3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(r==3) {
                        Intent intent = new Intent(getApplicationContext(), Game2.class);
                        intent.putExtra("rabbit", r);
                        startActivity(intent);
                    } else{
                        Intent intent = new Intent(getApplicationContext(), Game2.class);
                        intent.putExtra("rabbit", 0);
                        startActivity(intent);
                    }
                }
            });
    }


}
