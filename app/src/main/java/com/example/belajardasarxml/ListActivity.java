package com.example.belajardasarxml;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private RecyclerView rcyView;
    private MahasiswaAdapter mhsAdapter;
    private ArrayList<Mahasiswa> mhsArray = new ArrayList<>(); // Inisialisasi mhsArray
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);
        getDataList();
        inisialisasi();
    }
    public void inisialisasi() {
        rcyView = findViewById(R.id.ryc_view);
        mhsAdapter = new MahasiswaAdapter(mhsArray);
        RecyclerView.LayoutManager lymanager = new LinearLayoutManager(ListActivity.this);
        rcyView.setLayoutManager(lymanager);
        rcyView.setAdapter(mhsAdapter);
    }
    public void getDataList() {
        mhsArray.add(new Mahasiswa("1234567890000","a","LK"));
        mhsArray.add(new Mahasiswa("1234567890001","b","LK"));
        mhsArray.add(new Mahasiswa("1234567890002","c","LK"));
        mhsArray.add(new Mahasiswa("1234567890003","d","LK"));
        mhsArray.add(new Mahasiswa("1234567890004","e","LK"));
        mhsArray.add(new Mahasiswa("1234567890005","f","LK"));
        mhsArray.add(new Mahasiswa("1234567890006","g","LK"));
        mhsArray.add(new Mahasiswa("1234567890007","h","LK"));
        mhsArray.add(new Mahasiswa("1234567890008","i","LK"));
        mhsArray.add(new Mahasiswa("1234567890009","j","LK"));
        mhsArray.add(new Mahasiswa("12345678900010","k","LK"));
        mhsArray.add(new Mahasiswa("12345678900011","l","LK"));
        mhsArray.add(new Mahasiswa("12345678900012","m","LK"));
        mhsArray.add(new Mahasiswa("12345678900013","n","LKK"));
    }
}