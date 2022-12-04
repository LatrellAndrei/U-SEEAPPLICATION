package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class u601_to_m303_floor6_clicked extends AppCompatActivity {
    private Button btnu601;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u601_to_m303_floor6_clicked);
        btnu601 = (Button) findViewById(R.id.btnu601);
        btnu601.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(u601_to_m303_floor6_clicked.this, u601_to_m303_guide.class);
                startActivity(i);
            }
        });
    }
}