package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusFunc(View view) {
        EditText numBox1 = (EditText) findViewById(R.id.Num1);
        EditText numBox2 = (EditText) findViewById(R.id.Num2);
        int num1 = Integer.parseInt(numBox1.getText().toString());
        int num2 = Integer.parseInt(numBox2.getText().toString());
        int toSend = num1+num2;
        goToActivity2(String.valueOf(toSend));
    }


    public void minusFunc(View view) {
        EditText numBox1 = (EditText) findViewById(R.id.Num1);
        EditText numBox2 = (EditText) findViewById(R.id.Num2);
        int num1 = Integer.parseInt(numBox1.getText().toString());
        int num2 = Integer.parseInt(numBox2.getText().toString());
        int toSend = num1-num2;
        goToActivity2(String.valueOf(toSend));
    }

    public void multFunc(View view) {
        EditText numBox1 = (EditText) findViewById(R.id.Num1);
        EditText numBox2 = (EditText) findViewById(R.id.Num2);
        int num1 = Integer.parseInt(numBox1.getText().toString());
        int num2 = Integer.parseInt(numBox2.getText().toString());
        int toSend = num1*num2;
        goToActivity2(String.valueOf(toSend));
    }

    public void divFunc(View view) {
        EditText numBox1 = (EditText) findViewById(R.id.Num1);
        EditText numBox2 = (EditText) findViewById(R.id.Num2);
        int num1 = Integer.parseInt(numBox1.getText().toString());
        int num2 = Integer.parseInt(numBox2.getText().toString());
        int toSend = num1/num2;
        goToActivity2(String.valueOf(toSend));
    }

    private void goToActivity2(String res) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("FinalResult", res);
        startActivity(intent);
    }
}