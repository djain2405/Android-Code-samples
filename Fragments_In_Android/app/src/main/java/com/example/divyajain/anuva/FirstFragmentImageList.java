package com.example.divyajain.anuva;

import java.util.ArrayList;
import java.util.Arrays;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragmentImageList extends ListFragment {
    FirstCustomListAdapter aAdpt;

    // Array of integers points to images stored in /res/drawable/
    Integer[] imagesValues = new Integer[]{
            R.drawable.btn_camera_up,
            R.drawable.btn_climate_up,
            R.drawable.btn_experience_up,
            R.drawable.btn_fireplace_up,
            R.drawable.btn_garage_up,
            R.drawable.btn_gate_up,
            R.drawable.btn_light_up,
            R.drawable.btn_locks_up,
            R.drawable.btn_moods_up,
            R.drawable.btn_music_up,
            R.drawable.btn_pool_up,
            R.drawable.btn_security_up,
            R.drawable.btn_sprinkler_up,
            R.drawable.btn_tv_up,
            R.drawable.btn_window_up
    };

     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(imagesValues));
        aAdpt = new FirstCustomListAdapter(arrayList, getActivity());
        setListAdapter(aAdpt);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

}