package com.jeysi.chandaracommunitask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;
import com.jeysi.chandaracommunitask.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;


    //private Toolbar tabLayout2;
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

        viewPager = findViewById(R.id.viewPager);

        tabLayout = findViewById(R.id.tabLayout);



        //tabLayout = findViewById(R.id.tabLayout2);
    }

    private void addTabs(){


        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.homenav));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.addposticon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.searchicon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.notificon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.notiffill));

        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.getTabAt(0).setIcon(R.drawable.homenav);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                switch (tab.getPosition()) {
                    case 0:
                        tabLayout.getTabAt(0).setIcon(R.drawable.homenav);
                        break;
                    case 1:
                        tabLayout.getTabAt(0).setIcon(R.drawable.searchicon);
                        break;
                    case 2:
                        tabLayout.getTabAt(0).setIcon(R.drawable.addposticon);
                        break;
                    case 3:
                        tabLayout.getTabAt(0).setIcon(R.drawable.notiffill);
                        break;
                    case 4:
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.ic_menu_help);
                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                switch (tab.getPosition()) {
                    case 0:
                        tabLayout.getTabAt(0).setIcon(R.drawable.homenav);
                        break;
                    case 1:
                        tabLayout.getTabAt(0).setIcon(R.drawable.searchicon);
                        break;
                    case 2:
                        tabLayout.getTabAt(0).setIcon(R.drawable.addposticon);
                        break;
                    case 3:
                        tabLayout.getTabAt(0).setIcon(R.drawable.notificon);
                        break;
                    case 4:
                        tabLayout.getTabAt(0).setIcon(R.drawable.notiffill);
                        break;

                }

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

                switch (tab.getPosition()) {
                    case 0:
                        tabLayout.getTabAt(0).setIcon(R.drawable.homenav);
                        break;
                    case 1:
                        tabLayout.getTabAt(0).setIcon(R.drawable.searchicon);
                        break;
                    case 2:
                        tabLayout.getTabAt(0).setIcon(R.drawable.addposticon);
                        break;
                    case 3:
                        tabLayout.getTabAt(0).setIcon(R.drawable.notificon);
                        break;
                    case 4:
                        tabLayout.getTabAt(0).setIcon(R.drawable.notiffill);
                        break;

                }

            }
        });

    }
}