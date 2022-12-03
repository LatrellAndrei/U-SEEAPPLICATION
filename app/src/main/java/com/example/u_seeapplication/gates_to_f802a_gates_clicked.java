package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_f802a_gates_clicked extends AppCompatActivity {
    private Button gate2;

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_f802a_gates_clicked);
        gate2 = (Button) findViewById(R.id.gate2);

        gate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_f802a_gates_clicked.this, gates_to_f802a_gate2_clicked.class);
                startActivity(i);
            }
        });
    }
}