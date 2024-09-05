package com.example.belajardasarxml;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class relative_layout extends AppCompatActivity {
    private DatePickerDialog picker;
    private EditText txtedit;
    private Button btn_get_date;
    private TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        txtview = findViewById(R.id.tv_date);
        txtedit = findViewById(R.id.txt_date);
        txtedit.setInputType(InputType.TYPE_NULL);

        txtedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar ccc = Calendar.getInstance();
                int hari = ccc.get(Calendar.DAY_OF_MONTH);
                int bulan = ccc.get(Calendar.MONTH);
                int tahun = ccc.get(Calendar.YEAR);

                picker = new DatePickerDialog(relative_layout.this, new DatePickerDialog.OnDateSetListener(){
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        txtedit.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                    }
                }, tahun, bulan, hari);
                picker.show();
            }
        });

        btn_get_date = findViewById(R.id.btn_get_date);
        btn_get_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText("Selected Date: " + txtedit.getText());
            }
        });
    }
}
