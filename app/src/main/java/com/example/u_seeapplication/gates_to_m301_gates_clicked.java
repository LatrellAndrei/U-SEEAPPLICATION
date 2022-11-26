package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_m301_gates_clicked extends AppCompatActivity {
        private Button gate1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_m301_gates_clicked);

        gate1 = (Button) findViewById(R.id.gate1);

        gate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_m301_gates_clicked.this, gates_to_m301_gate1_clicked.class);
                startActivity(i);
            }
        });


    }
}