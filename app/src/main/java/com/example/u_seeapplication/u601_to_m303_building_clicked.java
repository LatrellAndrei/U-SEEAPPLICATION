package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class u601_to_m303_building_clicked extends AppCompatActivity {
    private Button btnbrs;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u601_to_m303_building_clicked);
        btnbrs = (Button) findViewById(R.id.btnbrs);

        btnbrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(u601_to_m303_building_clicked.this, u601_to_m303_brs_clicked.class);
                startActivity(i);
            }
        });
    }
}