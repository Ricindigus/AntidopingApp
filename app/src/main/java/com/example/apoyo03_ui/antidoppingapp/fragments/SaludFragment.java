package com.example.apoyo03_ui.antidoppingapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apoyo03_ui.antidoppingapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SaludFragment extends Fragment {


    public SaludFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_salud, container, false);
    }

}
