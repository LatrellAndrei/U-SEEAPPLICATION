package com.example.u_seeapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_m301 extends AppCompatActivity {

    private Button btngates,btnbuilding;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_m301);

        btngates = (Button) findViewById(R.id.btngates);

        btngates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_m301.this, gates_to_m301_gates_clicked.class);
                startActivity(i);
            }
        });
        btnbuilding = (Button) findViewById(R.id.btnbuilding);

        btnbuilding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_m301.this, f503_to_m301_building_clicked.class);
                startActivity(i);
            }
        });


    }
}