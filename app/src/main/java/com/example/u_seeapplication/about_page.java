package com.example.u_seeapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class about_page extends AppCompatActivity {

    ImageView facebook1, facebook2, facebook3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_page);

        facebook1 = findViewById(R.id.facebook1);
        facebook2 = findViewById(R.id.facebook2);
        facebook3 = findViewById(R.id.facebook3);

        //neds
        facebook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sAppLink = "fb://page/237564710351658";
                String sPackage = "com.facebook.katana";
                String sWebLink = "https://www.facebook.com/neds08";

                openLink(sAppLink,sPackage, sWebLink);
            }

            private void openLink(String sAppLink,String sPackage, String sWebLink) {
                try{
                    Uri uri = Uri.parse(sAppLink);
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setPackage(sPackage);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }catch (ActivityNotFoundException activityNotFoundException){
                    Uri uri = Uri.parse(sWebLink);
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });
        //latrell
        facebook2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sAppLink = "fb://page/237564710351658";
                String sPackage = "com.facebook.katana";
                String sWebLink = "https://www.facebook.com/Andrei.Latsseii";

                openLink(sAppLink,sPackage, sWebLink);
            }

            private void openLink(String sAppLink,String sPackage, String sWebLink) {
                try{
                    Uri uri = Uri.parse(sAppLink);
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setPackage(sPackage);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }catch (ActivityNotFoundException activityNotFoundException){
                    Uri uri = Uri.parse(sWebLink);
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });
        //kim
        facebook3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sAppLink = "fb://page/237564710351658";
                String sPackage = "com.facebook.katana";
                String sWebLink = "https://www.facebook.com/kimching.tiu.9";

                openLink(sAppLink,sPackage, sWebLink);
            }

            private void openLink(String sAppLink,String sPackage, String sWebLink) {
                try{
                    Uri uri = Uri.parse(sAppLink);
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setPackage(sPackage);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }catch (ActivityNotFoundException activityNotFoundException){
                    Uri uri = Uri.parse(sWebLink);
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });

    }
}