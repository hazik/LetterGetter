package com.awesome.lettergetter.tabs.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.awesome.lettergetter.tabs.GameFragment;
import com.awesome.lettergetter.tabs.LeaderboardFragment;
import com.awesome.lettergetter.tabs.ShopFragment;
 
public class TabsPagerAdapter extends FragmentPagerAdapter {
 
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
        	return new LeaderboardFragment();         
        case 1:
            // Games fragment activity
            return new GameFragment();
        case 2:
            // Movies fragment activity
        	return new ShopFragment();
           
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}