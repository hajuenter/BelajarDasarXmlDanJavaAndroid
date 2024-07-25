package com.example.belajardasarxml;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashboardActivity extends AppCompatActivity {
private TextView setlbluser, setlblpass;
private String tampilUser, tampilPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        inisialisasi_view();
        tampil();
    }
    public void inisialisasi_view() {
        setlbluser = findViewById(R.id.lbluser);
        setlblpass = findViewById(R.id.lblpassword);
    }
    public void tampil() {
        Intent hh = getIntent();
        tampilUser = hh.getStringExtra("getusername");
        tampilPass = hh.getStringExtra("getpassword");

        setlbluser.setText(tampilUser);
        setlblpass.setText(tampilPass);
    }
}