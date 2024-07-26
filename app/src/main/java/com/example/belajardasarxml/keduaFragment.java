package com.example.belajardasarxml;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */

public class keduaFragment extends Fragment {
private TextView txtfragmen2;
    public keduaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentwo = inflater.inflate(R.layout.fragment_kedua, container, false);
        //komponen
        txtfragmen2 = fragmentwo.findViewById(R.id.lblfrag2);
        txtfragmen2.setText("DARI FRAGMENT 2");
        return fragmentwo;
    }
}