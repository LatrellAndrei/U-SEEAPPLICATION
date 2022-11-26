package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_gym_gate3_clicked extends AppCompatActivity {

    private Button gate32gym_entrance;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_gym_gate3_clicked);

        gate32gym_entrance = (Button) findViewById(R.id.gate32gym_entrance);

        gate32gym_entrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_gym_gate3_clicked.this, gym2gate3_guide.class);
                startActivity(i);
            }
        });
    }
}