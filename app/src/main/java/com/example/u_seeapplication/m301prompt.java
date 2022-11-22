package com.example.u_seeapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class m301prompt extends AppCompatActivity {

    private Button btngates,btncolleges;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m301prompt);

        btngates = (Button) findViewById(R.id.btngates);

        btngates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(m301prompt.this, gate_clicked.class);
                startActivity(i);
            }
        });


    }
}