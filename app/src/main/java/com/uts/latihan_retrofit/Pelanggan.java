package com.uts.latihan_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pelanggan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelanggan);
    }

    public void back(View view){
        Intent i = new Intent(Pelanggan.this, MainActivity.class);
        startActivity(i);
    }

}