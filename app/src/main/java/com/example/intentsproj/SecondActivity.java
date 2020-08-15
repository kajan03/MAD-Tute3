package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etnum1;
    EditText etnum2;

    String number1;
    String number2;

    TextView result;

    int no1;
    int no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etnum1 = findViewById(R.id.etnum1);
        etnum2 = findViewById(R.id.etnum2);
        result = findViewById(R.id.result);

        Intent intent = getIntent();

        number1 = intent.getStringExtra("no1");
        number2 = intent.getStringExtra("no2");

        etnum1.setText(number1);
        etnum2.setText(number2);

        no1 = Integer.parseInt(number1);
        no2 = Integer.parseInt(number2);

    }

    public void add(View view){
        result.setText(number1 + " + " + number2 + " = " +(no1+no2));
    }

    public void subtract(View view){
        result.setText(number1 + " - " + number2 + " = " +(no1-no2));
    }
    public void multiply(View view){
        result.setText(number1 + " * " + number2 + " = " +(no1*no2));
    }
    public void divide(View view){
        result.setText(number1 + " / " + number2 + " = " +(no1/no2));
    }
}