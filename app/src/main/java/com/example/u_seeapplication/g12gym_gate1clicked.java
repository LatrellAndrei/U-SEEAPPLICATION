package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class g12gym_gate1clicked extends AppCompatActivity {

    private Button gate12gym_entrance;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g12gym_gate1clicked);

        gate12gym_entrance = (Button) findViewById(R.id.gate12gym_entrance);

        gate12gym_entrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(g12gym_gate1clicked.this, gym2gate1_guide.class);
                startActivity(i);
            }
        });
    }
}