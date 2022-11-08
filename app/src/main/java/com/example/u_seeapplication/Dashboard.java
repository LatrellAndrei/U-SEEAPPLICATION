package com.example.u_seeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Dashboard extends AppCompatActivity {

    CardView cardSearch;
    CardView cardGates;
    CardView cardDepartment;
    CardView cardFeature;
    CardView cardAbout;
    CardView cardLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        cardSearch = findViewById(R.id.cardSearch);
        cardGates = findViewById(R.id.cardGates);
        cardDepartment = findViewById(R.id.cardDepartment);
        cardFeature = findViewById(R.id.cardFeature);
        cardAbout = findViewById(R.id.cardAbout);
        cardLogout = findViewById(R.id.cardLogout);

        cardSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Search");
                view.getContext().startActivity(new Intent(view.getContext(),SearchRooms.class));
            }
        });

        cardGates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Gates");
                view.getContext().startActivity(new Intent(view.getContext(),gatesVP.class));
            }
        });

        cardDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Colleges");
                view.getContext().startActivity(new Intent(view.getContext(),CollegeViewer.class));
            }
        });

        cardFeature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Features ");
               // view.getContext().startActivity(new Intent(view.getContext(),ProfileActivity.class));

            }

        });

        cardAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("About U-SEE ");
                view.getContext().startActivity(new Intent(view.getContext(),About.class));
            }
        });

        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Exit");
                view.getContext().startActivity(new Intent(view.getContext(),GetStarted.class));
            }
        });

    }
    private  void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}