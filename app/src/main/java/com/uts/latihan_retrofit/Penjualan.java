package com.uts.latihan_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Penjualan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjualan);
    }

    public void back(View view){
        Intent i = new Intent(Penjualan.this, MainActivity.class);
        startActivity(i);
    }

}