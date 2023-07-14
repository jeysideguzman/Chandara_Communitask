package com.jeysi.chandaracommunitask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;
import com.jeysi.chandaracommunitask.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    ViewPagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        addTabs();

    }
    private void init(){

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
    }

    private void addTabs(){


        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.homenav));

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.homenav));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.homenav));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.homenav));

    }
}