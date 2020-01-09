package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EntryActivity extends AppCompatActivity {
    Button seqActivity;
    Button intentActivity;
    Button SPActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        seqActivity = findViewById(R.id.SeqActivity);
        intentActivity = findViewById(R.id.IntentActivity);
        SPActivity = findViewById(R.id.SPActivity);

        seqActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SeqActivity.class);
                startActivity(intent);
            }
        });

        intentActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IntentActivity.class);
                intent.putExtra("my int", 5);
                startActivity(intent);
            }
        });

        SPActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SPActivity.class);
                startActivity(intent);
            }
        });
    }
}

