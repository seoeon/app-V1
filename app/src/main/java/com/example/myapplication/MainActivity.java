package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText defaultEt;
    TextView worldTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        worldTV = findViewById(R.id.worldTV);
        Button defaultBtn = findViewById(R.id.defaultButton);
        defaultEt = findViewById(R.id.defaultEt);

        defaultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etString = defaultEt.getText().toString();
                worldTV.setText(etString);
            }
        });
    }
}
