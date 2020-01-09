package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Game2 extends AppCompatActivity {

    Button back;
    ImageView iv;
    int rabbit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        rabbit = getIntent().getExtras().getInt("rabbit");

        back = findViewById(R.id.back);
        iv = findViewById(R.id.imageView);

        if(rabbit == 0) {
            iv.setImageDrawable(getDrawable(R.drawable.empty));
        } else{
            iv.setImageDrawable(getDrawable(R.drawable.rabbit));
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
