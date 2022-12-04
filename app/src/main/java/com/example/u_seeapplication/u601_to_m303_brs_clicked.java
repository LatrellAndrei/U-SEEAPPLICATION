package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class u601_to_m303_brs_clicked extends AppCompatActivity {
    private Button floor6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u601_to_m303_brs_clicked);
        floor6 = (Button) findViewById(R.id.floor6);

        floor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(u601_to_m303_brs_clicked.this, u601_to_m303_floor6_clicked.class);
                startActivity(i);
            }
        });
    }
}