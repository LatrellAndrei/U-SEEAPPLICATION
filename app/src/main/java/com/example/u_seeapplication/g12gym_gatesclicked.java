package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class g12gym_gatesclicked extends AppCompatActivity {

    private Button gate1click;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g12gym_gatesclicked);

        gate1click = (Button) findViewById(R.id.gate1click);

        gate1click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(g12gym_gatesclicked.this, g12gym_gate1clicked.class);
                startActivity(i);
            }
        });
    }
}