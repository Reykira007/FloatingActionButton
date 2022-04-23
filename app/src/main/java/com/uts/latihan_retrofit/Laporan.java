package com.uts.latihan_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Laporan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);
    }

    public void back(View view){
        Intent i = new Intent(Laporan.this, MainActivity.class);
        startActivity(i);
    }

}