package com.example.adibf.adibfakhrimuhtadi_1202154192_m2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetailMenu extends AppCompatActivity {
    List<MakananMethod> bMenu;
    TextView nama, harga, komposisi;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        nama = (TextView)findViewById(R.id.namaMakanan);
        harga = (TextView)findViewById(R.id.hargaMakanan);
        komposisi = (TextView)findViewById(R.id.komposisi);
        gambar = (ImageView)findViewById(R.id.gambarMakanan);

        int gambarMkn = getIntent().getIntExtra("gambar",1);

        nama.setText(getIntent().getStringExtra("nama")); // memasukkan data makanan ke dalam masing-masing TextView

        harga.setText(getIntent().getStringExtra("harga"));

        gambar.setImageDrawable(getResources().getDrawable(gambarMkn));

        komposisi.setText(getIntent().getStringExtra("komposisi"));

    }
}
