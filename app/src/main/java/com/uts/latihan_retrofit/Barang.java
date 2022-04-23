package com.uts.latihan_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Barang extends AppCompatActivity {

    String name,number;
    FloatingActionButton fab;
    ListView listView;
    ArrayList<LvItem>arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);

        listView = findViewById(R.id.lv);
        fab = findViewById(R.id.flot);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(Barang.this);
                dialog.setContentView(R.layout.list_item);
                EditText etname = dialog.findViewById(R.id.etname);
                EditText etnumber = dialog.findViewById(R.id.etnumber);
                Button btnsave = dialog.findViewById(R.id.btnsave);


                btnsave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        name = etname.getText().toString();
                        number = etnumber.getText().toString();

                        LvItem lvItem = new LvItem();
                        lvItem.setName(name);
                        lvItem.setNumber(number);
                        arrayList.add(lvItem);
                        dialog.dismiss();

                        ContectAdapter contectAdapter = new ContectAdapter(arrayList, Barang.this);
                        listView.setAdapter(contectAdapter);
                    }
                });
                dialog.show();
            }
        });
    }

    //Tombol Kembali ke Dasboard
    public void back(View view){
        Intent i = new Intent(Barang.this, MainActivity.class);
        startActivity(i);
    }

}