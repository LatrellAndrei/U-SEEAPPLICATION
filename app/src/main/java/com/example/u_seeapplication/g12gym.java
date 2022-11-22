package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class g12gym extends AppCompatActivity {

    private Button g12gym, btncolleges;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g12gym);

        g12gym = (Button) findViewById(R.id.g12gym);

        g12gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(g12gym.this, g12gym_gatesclicked.class);
                startActivity(i);
            }
        });
        btncolleges = (Button) findViewById(R.id.btncolleges);

        btncolleges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(g12gym.this, colleges.class);
                startActivity(i);
            }
        });
    }
}