package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gate_clicked extends AppCompatActivity {
        private Button gate1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate_clicked);

        gate1 = (Button) findViewById(R.id.gate1);

        gate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gate_clicked.this, where.class);
                startActivity(i);
            }
        });


    }
}