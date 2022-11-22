package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class g62gym_gate6clicked extends AppCompatActivity {

    private Button gate62gym_entrance;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g62gym_gate6clicked);

        gate62gym_entrance = (Button) findViewById(R.id.gate62gym_entrance);

        gate62gym_entrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(g62gym_gate6clicked.this, gym2gate6_guide.class);
                startActivity(i);
            }
        });
    }
}