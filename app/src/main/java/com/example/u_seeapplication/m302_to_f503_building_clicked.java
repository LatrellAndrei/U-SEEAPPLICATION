package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class m302_to_f503_building_clicked extends AppCompatActivity {

    private Button main;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m302_to_f503_building_clicked);

        main = (Button) findViewById(R.id.main);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(m302_to_f503_building_clicked.this, m302_to_f503_main_clicked.class);
                startActivity(i);
            }
        });
    }
}