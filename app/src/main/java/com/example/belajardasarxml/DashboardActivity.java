package com.example.belajardasarxml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DashboardActivity extends AppCompatActivity {
private TextView setlbluser, setlblpass;
private String tampilUser, tampilPass;
private Button btnfrag1, btnfrag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        inisialisasi_view();
        tampil();
// untuk memanggil fragment
//        FragmentManager fm1 = getSupportFragmentManager();
//        fm1.beginTransaction()
//                .add(R.id.frame_fragment, new pertamaFragment())
//                .commit();

        //untuk memanggil fragment dengan klik button menggunakan add
        //kekurangan menggunakan add fragment jadi menumpuk dan tidak hilang
//        btnfrag1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fm1 = getSupportFragmentManager();
//        fm1.beginTransaction().add(R.id.frame_fragment, new pertamaFragment()).commit();
//            }
//        });
//        btnfrag2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fm2 = getSupportFragmentManager();
//                fm2.beginTransaction().add(R.id.frame_fragment, new keduaFragment()).commit();
//            }
//        });
        //menggunakan replace
        btnfrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm1 = getSupportFragmentManager();
                FragmentTransaction ft1 = fm1.beginTransaction();
                ft1.replace(R.id.frame_fragment, new pertamaFragment()).commit();
            }
        });
        btnfrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm2 = getSupportFragmentManager();
                FragmentTransaction ft2 = fm2.beginTransaction();
                ft2.replace(R.id.frame_fragment, new keduaFragment()).commit();
            }
        });

    }
    public void inisialisasi_view() {
        setlbluser = findViewById(R.id.lbluser);
        setlblpass = findViewById(R.id.lblpassword);
        btnfrag1 = findViewById(R.id.btn_f1);
        btnfrag2 = findViewById(R.id.btn_f2);
    }
    public void tampil() {
        Intent hh = getIntent();
        tampilUser = hh.getStringExtra("getusername");
        tampilPass = hh.getStringExtra("getpassword");

        setlbluser.setText(tampilUser);
        setlblpass.setText(tampilPass);
    }

}