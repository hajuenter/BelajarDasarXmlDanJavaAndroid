package com.example.belajardasarxml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin; //deklarasi button
    private EditText txtuser, txtpassword;
    private String getuser, getpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        inisialisasi();
        ambil();
//        btnLogin = findViewById(R.id.btnLogin); //mencari button login via id
//        //memberi perintah untuk btnLogin saat di klik akan menjalankan funsi onclick
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //intent adalah sebuah komponen yang digunakan untuk berpindah halaman dari xml ke xml lain
//                //contoh disini tampilan pertama adalah loginActivity lalu ketika btnLogin di klik maka akan
//                //berpindah halaman ke DashboardActivity
//                Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
//                startActivity(i);
//            }
//        });
    }
    public void inisialisasi() {
        btnLogin = findViewById(R.id.btnLogin); //mencari button login via id
        txtuser = findViewById(R.id.txt_user);
        txtpassword = findViewById(R.id.txt_password);
    }
    public void ambil() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getuser = txtuser.getText().toString(); //mengambil nilai input dari txtuser lalu disimpan ke variabel getuser
                getpassword = txtpassword.getText().toString();
                //membuat intent
                Intent gg = new Intent(LoginActivity.this, DashboardActivity.class);
                gg.putExtra("getusername", getuser); //mengambil data melalui intent dengan put extra dengan nama key getusername
                gg.putExtra("getpassword", getpassword); //dan isinya adalah variabel getuser
                //nama key digunakan untuk mengambil nilai yang nanti dipanggil di activity lain
                startActivity(gg);
            }
        });
    }

}