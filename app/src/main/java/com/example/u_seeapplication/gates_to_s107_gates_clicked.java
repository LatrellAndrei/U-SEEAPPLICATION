package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_s107_gates_clicked extends AppCompatActivity {
    private Button gate6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_s107_gates_clicked);
        gate6 = (Button) findViewById(R.id.gate6);

        gate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_s107_gates_clicked.this, gates_to_s107_gate6_clicked.class);
                startActivity(i);
            }
        });
    }
}