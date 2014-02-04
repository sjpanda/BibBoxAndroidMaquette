package com.example.bibboxandroidmaquette.fragment;

import com.example.bibboxandroidmaquette.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NouvelleReservationFragment extends Fragment {
	
	public NouvelleReservationFragment(){}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.nouvelle_reservation,
				container, false);

		return rootView;
	}
}
