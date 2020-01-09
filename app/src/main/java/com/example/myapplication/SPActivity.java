package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SPActivity extends AppCompatActivity {

    SharedPreferences sharedPref;
    SharedPreferences.Editor sharedEditor;

    Button saveBtn, loadBtn;
    EditText SpEt;
    TextView SpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);

        sharedPref = getSharedPreferences("test_pref", Context.MODE_PRIVATE);
        sharedEditor = sharedPref.edit();

        saveBtn = findViewById(R.id.SaveBtn);
        loadBtn = findViewById(R.id.LoadBtn);
        SpEt = findViewById(R.id.SpEt);
        SpTextView = findViewById(R.id.SpTextView);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedEditor.putString(getString(R.string.sp_test), SpEt.getText().toString());
                sharedEditor.apply();
            }
        });

        loadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = sharedPref.getString(getString(R.string.sp_test), "null");
                SpTextView.setText(res);
            }
        });
    }
}
