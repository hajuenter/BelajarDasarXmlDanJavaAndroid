package com.example.belajardasarxml;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */

public class pertamaFragment extends Fragment {
private TextView txtfragmen1;
    public pertamaFragment() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_pertama, container, false);
        //agar fragmen bisa disisipkan harus menyimpan fragmen ke variabel
        View fragmenone = inflater.inflate(R.layout.fragment_pertama, container, false);
        //komponen
        txtfragmen1 = fragmenone.findViewById(R.id.lblfrag1);
        txtfragmen1.setText("Dari fragment 1");
        return fragmenone;
    }
}