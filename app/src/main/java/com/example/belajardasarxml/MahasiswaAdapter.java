package com.example.belajardasarxml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MhsViewHolder> {
    private ArrayList<Mahasiswa> listMhs;

    // Constructor untuk adapter, menerima ArrayList dari objek Mahasiswa
    public MahasiswaAdapter(ArrayList<Mahasiswa> listMhs) {
        this.listMhs = listMhs;
    }

    @NonNull
    @Override
    public MahasiswaAdapter.MhsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate layout list_mahasiswa untuk setiap item dalam RecyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_mahasiswa, parent, false);
        return new MhsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.MhsViewHolder holder, int position) {
        // Mengikat data ke ViewHolder, menetapkan nilai TextView sesuai dengan data dari listMhs
        Mahasiswa currentMahasiswa = listMhs.get(position);
        holder.nim.setText(currentMahasiswa.getNim());
        holder.nama.setText(currentMahasiswa.getNama());
        holder.jenis_kelamin.setText(currentMahasiswa.getJenis_kealamin());
    }

    @Override
    public int getItemCount() {
        // Mengembalikan ukuran listMhs, atau 0 jika listMhs adalah null
        return (listMhs != null) ? listMhs.size() : 0;
    }

    // ViewHolder untuk RecyclerView, menyimpan referensi ke TextView untuk setiap item
    public static class MhsViewHolder extends RecyclerView.ViewHolder {
        private TextView nim, nama, jenis_kelamin;

        public MhsViewHolder(View view) {
            super(view);
            nim = view.findViewById(R.id.lblnim);
            nama = view.findViewById(R.id.lblnama);
            jenis_kelamin = view.findViewById(R.id.lblkelamin);
        }
    }
}
