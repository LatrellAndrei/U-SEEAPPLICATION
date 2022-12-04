package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class f503_to_m301_eds_clicked extends AppCompatActivity {
    private Button floor5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f503_to_m301_eds_clicked);
        floor5 = (Button) findViewById(R.id.floor5);

        floor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(f503_to_m301_eds_clicked.this, f503_to_m301_floor5_clicked.class);
                startActivity(i);
            }
        });

    }
}