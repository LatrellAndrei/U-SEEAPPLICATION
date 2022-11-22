package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class g12gym_gatesclicked extends AppCompatActivity {

    private Button gate1click,gate3click,gate5click,gate6click;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g12gym_gatesclicked);

        //gate1clicked
        gate1click = (Button) findViewById(R.id.gate1click);
        gate1click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(g12gym_gatesclicked.this, g12gym_gate1clicked.class);
                startActivity(i);
            }
        });
    //gate3clicked
        gate3click = (Button) findViewById(R.id.gate3);
        gate3click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(g12gym_gatesclicked.this, g32gym_gate3clicked.class);
                startActivity(i);
            }
        });
        //gate5clicked
        gate5click = (Button) findViewById(R.id.gate5);
        gate5click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(g12gym_gatesclicked.this, g52gym_gate5cliked.class);
                startActivity(i);
            }
        });
        //gate6clicked
        gate6click = (Button) findViewById(R.id.gate6);
        gate6click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(g12gym_gatesclicked.this, g62gym_gate6clicked.class);
                startActivity(i);
            }
        });
    }
}