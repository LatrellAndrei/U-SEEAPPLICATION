package com.example.u_seeapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;

public class gates_list extends AppCompatActivity {

    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roombg);

        viewPager2 = findViewById(R.id.viewpager);
        int[] images = { R.drawable.gate1ent,
                         R.drawable.gate2,
                         R.drawable.gate3,
                         R.drawable.gate5,
                         R.drawable.gate6};
        String[] heading = { "Gate 1",
                             "Gate 2",
                             "Gate 3",
                             "Gate 5",
                             "Gate 6"};
        String[] desc = {getString(R.string.gate1),
                         getString(R.string.gate2),
                         getString(R.string.gate3),
                         getString(R.string.gate5),
                         getString(R.string.gate6)};

        viewPagerItemArrayList = new ArrayList<>();

        for (int i = 0; i<images.length ; i++){

            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i], heading[i], desc[i]);
            viewPagerItemArrayList.add(viewPagerItem);

        }
        VPAdapter vpAdapter = new VPAdapter(viewPagerItemArrayList);
        viewPager2.setAdapter(vpAdapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

    }
}