package com.awesome.lettergetter.tabs;

import com.awesome.lettergetter.R;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.ArrayAdapter;

public class GameFragment extends ListFragment {
	
	
//	 String[] countries = new String[] {
//		        "S",
//		        "_",
//		        "A",
//		        "R",
//
//		    };
//		 

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_games, container, false);
//		
//		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1,countries);
//		 
//	        /** Setting the list adapter for the ListFragment */
//	        setListAdapter(adapter);
//	 
//	        return super.onCreateView(inflater, container, savedInstanceState);
//	    
		return rootView;
	}
}
