package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_s216_gate5_clicked extends AppCompatActivity {
    private Button btnent;

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_s216_gate5_clicked);
        btnent = (Button) findViewById(R.id.btnent);

        btnent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_s216_gate5_clicked.this, room_s216_cea_office.class);
                startActivity(i);
            }
        });
    }
}