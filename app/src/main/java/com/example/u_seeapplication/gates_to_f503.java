package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_f503 extends AppCompatActivity {
    private Button btngates,btnbuilding,facilities;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_f503);
        btngates = (Button) findViewById(R.id.btngates);

        btngates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_f503.this, gates_to_f503_gates_clicked.class);
                startActivity(i);
            }
        });
        btnbuilding = (Button) findViewById(R.id.btnbuilding);
        btnbuilding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_f503.this, m302_to_f503_building_clicked.class);
                startActivity(i);
            }
        });
        facilities = (Button) findViewById(R.id.facilities);
        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_f503.this, main_library_to_f503_facilities_clicked.class);
                startActivity(i);
            }
        });


    }
}