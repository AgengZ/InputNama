package com.example.inputnama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText teksNamaDepan, teksNamaBelakang;
    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teksNamaDepan = findViewById(R.id.txtNamaD);
        teksNamaBelakang = findViewById(R.id.txtNamaB);
        out = findViewById(R.id.viewHasil);
    }

    public void getTampil(View view) {
        out.setText("Nama anda : "+teksNamaDepan.getText()+" "+teksNamaBelakang.getText());
    }
}