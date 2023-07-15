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

        viewPager = findViewById(R.id.viewPager);

        tabLayout = findViewById(R.id.tabLayout);





    }

    private void addTabs(){


        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.newhomenav));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.newinsightsnav));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.addpostblack));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.newcommunidaynav));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.usericon));




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
                        tabLayout.getTabAt(0).setIcon(R.drawable.newhomenav);
                        break;
                    case 1:
                        tabLayout.getTabAt(1).setIcon(R.drawable.newinsightsnav);
                        break;
                    case 2:
                        tabLayout.getTabAt(2).setIcon(R.drawable.addpostblack);
                        break;
                    case 3:
                        tabLayout.getTabAt(3).setIcon(R.drawable.newcommunidaynav);
                        break;
                    case 4:
                        tabLayout.getTabAt(4).setIcon(R.drawable.usericon);
                        break;



                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                switch (tab.getPosition()) {
                    case 0:
                        tabLayout.getTabAt(0).setIcon(R.drawable.newhomenav);
                        break;
                    case 1:
                        tabLayout.getTabAt(1).setIcon(R.drawable.newinsightsnav);
                        break;
                    case 2:
                        tabLayout.getTabAt(2).setIcon(R.drawable.addpostblack);
                        break;
                    case 3:
                        tabLayout.getTabAt(3).setIcon(R.drawable.newcommunidaynav);
                        break;
                    case 4:
                        tabLayout.getTabAt(4).setIcon(R.drawable.usericon);
                        break;



                }

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

                switch (tab.getPosition()) {
                    case 0:
                        tabLayout.getTabAt(0).setIcon(R.drawable.newhomenav);
                        break;
                    case 1:
                        tabLayout.getTabAt(1).setIcon(R.drawable.newinsightsnav);
                        break;
                    case 2:
                        tabLayout.getTabAt(2).setIcon(R.drawable.addpostblack);
                        break;
                    case 3:
                        tabLayout.getTabAt(3).setIcon(R.drawable.newcommunidaynav);
                        break;
                    case 4:
                        tabLayout.getTabAt(4).setIcon(R.drawable.usericon);
                        break;

                }

            }
        });

    }




}