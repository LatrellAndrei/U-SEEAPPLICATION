package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_library_to_f503_facilities_clicked extends AppCompatActivity {
    private Button g1library,theatre;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_library_to_f503_facilities_clicked);
        g1library = (Button) findViewById(R.id.g1library);

        g1library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(main_library_to_f503_facilities_clicked.this, main_library_to_f503_guide.class);
                startActivity(i);
            }
        });

        theatre = (Button) findViewById(R.id.theatre);

        theatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(main_library_to_f503_facilities_clicked.this, theatre_to_f503_guide.class);
                startActivity(i);
            }
        });
    }
}