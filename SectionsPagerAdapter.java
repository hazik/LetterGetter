package com.awesome.lettergetter.tabs.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter{
	
	   List<Fragment> fragmentList;

	    public SectionsPagerAdapter(android.support.v4.app.FragmentManager fm, List<Fragment> fragments) {
	        super(fm);
	        fragmentList = fragments;
	    }

	@Override
	public int getCount() {
	    return fragmentList.size();
	}

	    @Override
	    public Fragment getItem(int position) {
	        Fragment fragment = fragmentList.get(position);        
	        return fragment;
	    }

}
