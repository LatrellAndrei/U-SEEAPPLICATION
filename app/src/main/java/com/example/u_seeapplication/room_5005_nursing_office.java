package com.example.u_seeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

public class room_5005_nursing_office extends AppCompatActivity {
    private ViewFlipper viewFlipper;
    private ImageButton Next, Previous;
    private Button dashbtn, btnroom;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room5005_nursing_office);
        viewFlipper = findViewById(R.id.view_flipper);
        Next = findViewById(R.id.next);
        Previous = findViewById(R.id.previous);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showNext();
            }
        });
        Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showPrevious();
            }
        });

        dashbtn = (Button) findViewById(R.id.dashbtn);
        dashbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(room_5005_nursing_office.this, Dashboard.class);
                startActivity(i);
            }
        });

        btnroom = (Button) findViewById(R.id.btnroom);
        btnroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(room_5005_nursing_office.this, search_rooms_listview.class);
                startActivity(i);
            }
        });
    }
}