package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_s216_gates_clicked extends AppCompatActivity {
    private Button gate5;

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_s216_gates_clicked);
        gate5 = (Button) findViewById(R.id.gate5);

        gate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_s216_gates_clicked.this, gates_to_s216_gate5_clicked.class);
                startActivity(i);
            }
        });
    }
}