package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class m301_to_gym_building_clicked extends AppCompatActivity {
    private Button btncitcs;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m301_to_gym_building_clicked);

        btncitcs = (Button) findViewById(R.id.btncitcs);

        btncitcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(m301_to_gym_building_clicked.this, m301_to_gym_main_building_clicked.class);
                startActivity(i);
            }
        });
    }
}