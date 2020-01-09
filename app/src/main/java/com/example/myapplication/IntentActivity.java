package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class IntentActivity extends AppCompatActivity {

    ImageView iv;
    Button change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        iv = findViewById(R.id.image);
        change = findViewById(R.id.change);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageDrawable(getDrawable(R.drawable.pic));
            }
        });

        int myInt = getIntent().getExtras().getInt("my int");
        Log.e("REXYREX", ""+myInt);
    }
}
