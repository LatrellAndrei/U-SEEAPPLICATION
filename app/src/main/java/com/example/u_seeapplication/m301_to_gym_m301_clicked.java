package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class m301_to_gym_m301_clicked extends AppCompatActivity {
    private Button btnm301;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m301_to_gym_m301_clicked);


        btnm301 = (Button) findViewById(R.id.btnm301);
        btnm301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(m301_to_gym_m301_clicked.this, m301_to_gym_guide.class);
                startActivity(i);
            }
        });
    }
}