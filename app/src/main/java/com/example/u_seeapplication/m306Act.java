package com.example.u_seeapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class m306Act extends AppCompatActivity {

    private ViewFlipper viewFlipper;
    private ImageButton Next, Previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m306room);
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
    }
}