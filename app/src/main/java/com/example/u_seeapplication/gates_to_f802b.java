package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gates_to_f802b extends AppCompatActivity {
    private Button btngates;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gates_to_f802b);
        btngates = (Button) findViewById(R.id.btngates);

        btngates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gates_to_f802b.this, gates_to_f802b_gates_clicked.class);
                startActivity(i);
            }
        });
    }
}