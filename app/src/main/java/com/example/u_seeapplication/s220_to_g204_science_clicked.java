package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class s220_to_g204_science_clicked extends AppCompatActivity {

    private Button floor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s220_to_g204_science_clicked);

        floor2 = (Button) findViewById(R.id.floor2);

        floor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(s220_to_g204_science_clicked.this, s220_to_g204_s220_clicked.class);
                startActivity(i);
            }
        });
    }
}