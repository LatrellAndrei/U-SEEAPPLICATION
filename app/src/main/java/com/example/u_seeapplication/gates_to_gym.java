package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_gym extends AppCompatActivity {

    private Button g12gym, btncolleges;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_gym);

        g12gym = (Button) findViewById(R.id.g12gym);

        g12gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_gym.this, gates_to_gym_gates_clicked.class);
                startActivity(i);
            }
        });
        btncolleges = (Button) findViewById(R.id.btncolleges);

        btncolleges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_gym.this, m301_to_gym_colleges_clicked.class);
                startActivity(i);
            }
        });
    }
}