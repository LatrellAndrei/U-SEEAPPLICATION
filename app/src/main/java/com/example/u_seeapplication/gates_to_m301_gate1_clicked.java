package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_m301_gate1_clicked extends AppCompatActivity {
    private Button btnent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_m301_gate1_clicked);

        btnent = (Button) findViewById(R.id.btnent);

        btnent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_m301_gate1_clicked.this, room_m301.class);
                startActivity(i);
            }
        });







    }
}