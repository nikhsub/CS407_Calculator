package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView resDisp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resDisp = (TextView) findViewById(R.id.result);
        Intent intent = getIntent();
        String res = intent.getStringExtra("FinalResult");
        resDisp.setText(res);
    }
}