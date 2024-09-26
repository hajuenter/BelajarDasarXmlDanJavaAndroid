package com.example.belajardasarxml;

import android.os.Bundle;
import android.view.Menu;  // Import Menu yang benar
import android.view.View;  // Import View untuk menghindari error
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class list_negara extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listview;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_negara);

        listview = findViewById(R.id.listViewww); // Pastikan ID ini sesuai dengan ListView di layout
        adapter = ArrayAdapter.createFromResource(this, R.array.negara_array, android.R.layout.simple_list_item_1);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {  // Perbaiki nama metode menjadi onCreateOptionsMenu
        getMenuInflater().inflate(R.menu.list, menu);
        return true;  // Harus mengembalikan true
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Tindakan yang dilakukan saat item diklik
        Toast.makeText(this, adapter.getItem(position), Toast.LENGTH_SHORT).show();
    }
}