package com.example.u_seeapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;

public class collegeVP extends AppCompatActivity {

    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roombg);

        viewPager2 = findViewById(R.id.viewpager);
        int[] images = {
                R.drawable.citcsbanner,
                R.drawable.m302,
                R.drawable.coabanner,
                R.drawable.coa,
                R.drawable.ceabanner,
                R.drawable.cea};
        String[] heading = {
                //for banner
                getString(R.string.SITCS),
                getString(R.string.SITCS),
                //for banner
                getString(R.string.SOA),
                getString(R.string.SOA),
                //for banner
                getString(R.string.SEA),
                getString(R.string.SEA)};
        String[] desc = {
                //for banner
                getString(R.string.CITCS),
                getString(R.string.CITCS),
                //for banner
                getString(R.string.COA),
                getString(R.string.COA),
                //for banner
                getString(R.string.CEA),
                getString(R.string.CEA)};

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