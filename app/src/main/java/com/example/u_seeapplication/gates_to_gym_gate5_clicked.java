package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_gym_gate5_clicked extends AppCompatActivity {

    private Button gate52gym_entrance;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_gym_gate5_clicked);
        gate52gym_entrance = (Button) findViewById(R.id.gate52gym_entrance);
        gate52gym_entrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_gym_gate5_clicked.this, gym2gate5_guide.class);
                startActivity(i);
            }
        });

    }
}