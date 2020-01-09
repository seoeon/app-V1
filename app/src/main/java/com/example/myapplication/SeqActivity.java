package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SeqActivity extends AppCompatActivity {

    TextView SeqTV;
    EditText SeqEt;
    Button SeqBtn, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seq);

        SeqTV = findViewById(R.id.SeqTV);
        SeqEt = findViewById(R.id.SeqEt);
        SeqBtn = findViewById(R.id.SeqBtn);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
