package com.example.rajpu.illnessdetector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class two extends AppCompatActivity {
    Button dise,symp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        symp=findViewById(R.id.button);
        dise=findViewById(R.id.button2);
        dise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(two.this,symptoms.class);
                startActivity(intent);
            }

    });
        symp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(two.this,disease.class);
                startActivity(in);
            }
        });
}}
