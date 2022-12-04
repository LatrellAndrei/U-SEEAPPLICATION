package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class f503_to_m301_floor5_clicked extends AppCompatActivity {
    private Button btnf503;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f503_to_m301_floor5_clicked);
        btnf503 = (Button) findViewById(R.id.btnf503);
        btnf503.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(f503_to_m301_floor5_clicked.this, f503_to_m301_guide.class);
                startActivity(i);
            }
        });
    }
}