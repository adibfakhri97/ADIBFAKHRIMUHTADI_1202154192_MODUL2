package com.example.adibf.adibfakhrimuhtadi_1202154192_m2;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MenuMakanan extends AppCompatActivity {
    private RecyclerView RecyclerV;
    private List<MakananMethod> aMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);

        RecyclerV = (RecyclerView) findViewById(R.id.recyclerview);

        RecyclerV.setHasFixedSize(true);
        RecyclerV.setLayoutManager(new LinearLayoutManager(this));

        aMenu = new ArrayList<>();

        //isi data makanan
        aMenu.add(new MakananMethod(1, "Nasi Goreng", "Harga RP 12.000", R.drawable.nasgor, "Bumbu Nasi Goreng, Telur, Selada"));
        aMenu.add(new MakananMethod(2, "Mie Goreng", "Harga RP 12.000", R.drawable.miegor, "Bumbu Mie Goreng, Telur, Selada"));
        aMenu.add(new MakananMethod(3, "Capcay", "Harga RP 12.000", R.drawable.capcay, "Wortel, Brokoli, Kol"));
        aMenu.add(new MakananMethod(4, "Mie Kuah", "Harga RP 10.000", R.drawable.mieku, "Indomie, telur"));
        aMenu.add(new MakananMethod(5, "Nasi Goreng Spesial", "Harga RP 15.000", R.drawable.nasgorsp, "Bumbu Nasi Goreng, Telur, Selada, Ayam"));
        aMenu.add(new MakananMethod(6, "Ayam Geprek", "Harga RP 16.000", R.drawable.geprek, "Ayam, tahu, tempe"));
        aMenu.add(new MakananMethod(7, "Ayam Crispy", "Harga RP 14.000", R.drawable.crispy, "Ayam, saus, mayonais"));
        aMenu.add(new MakananMethod(8, "Soto Ayam", "Harga RP 20.000", R.drawable.soto, "ayam, bumbu soto, kerupuk"));
        aMenu.add(new MakananMethod(9, "Gule Ayam", "Harga RP 20.000", R.drawable.gule, "ayam, bumbu gule, kerupuk"));
        aMenu.add(new MakananMethod(10, "Batagor", "Harga RP 7.000", R.drawable.batagor, "Baso, Tahu, Tepung"));


        adapterListMenu adapter = new adapterListMenu(this, aMenu);

        RecyclerV.setAdapter(adapter);


    }



    }

