package com.example.rajpu.illnessdetector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class disease extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);
        b1 = (Button) findViewById(R.id.button5);
        b2 = (Button) findViewById(R.id.button6);
        b3 = (Button) findViewById(R.id.button7);
        b4 = (Button) findViewById(R.id.button8);
        b5 = (Button) findViewById(R.id.button9);
        b6 = (Button) findViewById(R.id.button10);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent il = new Intent(disease.this, first.class);
                startActivity(il);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lo = new Intent(disease.this, second.class);
                startActivity(lo);
            }
        });  b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(disease.this, third.class);
                startActivity(l);
            }
        });  b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(disease.this, fourth.class);
                startActivity(i);
            }
        });  b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ill = new Intent(disease.this, fifth.class);
                startActivity(ill);
            }
        });  b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iil = new Intent(disease.this, sixth.class);
                startActivity(iil);
            }
        });







    }
}