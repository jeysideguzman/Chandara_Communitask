package com.jeysi.chandaracommunitask.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.jeysi.chandaracommunitask.fragments.AddPost;
import com.jeysi.chandaracommunitask.fragments.CommuniDay;
import com.jeysi.chandaracommunitask.fragments.CommuniPoints;
import com.jeysi.chandaracommunitask.fragments.Home;
import com.jeysi.chandaracommunitask.fragments.Insights;

import com.jeysi.chandaracommunitask.fragments.Profile;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    int noOfTabs;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int noOfTabs) {
        super(fm);
        this.noOfTabs = noOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new Home();

            case 1:
                return new Insights();

            case 2:
                return new AddPost();

            case 3:
                return new CommuniDay();

            case 4:
                return new Profile();



            default:
                return null;



        }

    }

    @Override
    public int getCount() {

        return noOfTabs;
    }
}
