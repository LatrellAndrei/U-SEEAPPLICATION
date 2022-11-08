package com.example.u_seeapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivityViewPagerM301 extends AppCompatActivity {

    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roombg);

        viewPager2 = findViewById(R.id.viewpager);
        int[] images = { R.drawable.m301l, R.drawable.m301, R.drawable.m301r};
        String[] heading = { "M301", "M301", "M301"};
        String[] desc = {getString(R.string.a_desc), getString(R.string.a_desc), getString(R.string.a_desc)};

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