package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cafeteria_to_s214_facilities_clicked extends AppCompatActivity {
    private Button cafeteria;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafeteria_to_s214_facilities_clicked);
        cafeteria = (Button) findViewById(R.id.cafeteria);

        cafeteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(cafeteria_to_s214_facilities_clicked.this, cafeteria_to_s214_guide.class);
                startActivity(i);
            }
        });
    }
}