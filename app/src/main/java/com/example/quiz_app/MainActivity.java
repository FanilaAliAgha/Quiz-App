package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



        public com.google.android.material.textview.MaterialTextView ch1;
        public com.google.android.material.textview.MaterialTextView ch2;
        public com.google.android.material.textview.MaterialTextView ch3;
        public com.google.android.material.textview.MaterialTextView ch4;
        public com.google.android.material.textview.MaterialTextView ch5;
        public com.google.android.material.textview.MaterialTextView ch6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ch1= (com.google.android.material.textview.MaterialTextView) findViewById(R.id.ch1);
        ch2= (com.google.android.material.textview.MaterialTextView) findViewById(R.id.ch2);
        ch3= (com.google.android.material.textview.MaterialTextView) findViewById(R.id.ch3);
        ch4= (com.google.android.material.textview.MaterialTextView) findViewById(R.id.ch4);
        ch5= (com.google.android.material.textview.MaterialTextView) findViewById(R.id.ch5);
        ch6= (com.google.android.material.textview.MaterialTextView) findViewById(R.id.ch6);


        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,QuestionActivity.class);
                startActivity(intent);
            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quiz2= new Intent(MainActivity.this,C2QuestionActivity.class);
                startActivity(quiz2);
            }
        });

        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,C3QuestionActivity.class);
                startActivity(intent);
            }
        });
        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,C4QuestionActivity.class);
                startActivity(intent);
            }
        });

        ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,C5QuestionActivity.class);
                startActivity(intent);
            }
        });

        ch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,C6QuestionActivity.class);
                startActivity(intent);
            }
        });


    }
}