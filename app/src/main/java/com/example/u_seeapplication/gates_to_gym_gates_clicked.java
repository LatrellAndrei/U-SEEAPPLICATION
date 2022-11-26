package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_gym_gates_clicked extends AppCompatActivity {

    private Button gate1click,gate3click,gate5click,gate6click;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_gym_gates_clicked);

        //gate1clicked
        gate1click = (Button) findViewById(R.id.gate1click);
        gate1click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_gym_gates_clicked.this, gates_to_gym_gate1_clicked.class);
                startActivity(i);
            }
        });
    //gate3clicked
        gate3click = (Button) findViewById(R.id.gate3);
        gate3click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_gym_gates_clicked.this, gates_to_gym_gate3_clicked.class);
                startActivity(i);
            }
        });
        //gate5clicked
        gate5click = (Button) findViewById(R.id.gate5);
        gate5click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_gym_gates_clicked.this, gates_to_gym_gate5_clicked.class);
                startActivity(i);
            }
        });
        //gate6clicked
        gate6click = (Button) findViewById(R.id.gate6);
        gate6click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_gym_gates_clicked.this, gates_to_gym_gate6_clicked.class);
                startActivity(i);
            }
        });
    }
}