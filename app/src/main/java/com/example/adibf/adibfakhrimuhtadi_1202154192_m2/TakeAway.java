package com.example.adibf.adibfakhrimuhtadi_1202154192_m2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    //mendeklarasi variable labelSpinner
    private String labelSpinner="";

    private String nothingSelected="Silakan Pilih Meja";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        //Membuat variable spinner dengan id spinner yang sudah ada
        Spinner spinner = (Spinner) findViewById(R.id.spinner_label);
        if (spinner != null){
            spinner.setOnItemSelectedListener(this);
        }

        // Membuat ArrayAdapter menggunakan array string dan layout spinner default
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_array, android.R.layout.simple_spinner_item);

        // Menentukan tata letak yang akan digunakan saat daftar pilihan muncul.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //
        if (spinner != null){
            spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        labelSpinner = parent.getItemAtPosition(position).toString();
        toastMeja(labelSpinner); //Menampilkan Toast berdasarkan meja yang dipilih

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        toastMeja(nothingSelected); //menampilkan toast jika tidak ada pilihan yang diklik

    }

    public void toastMeja(String pesan){
        Toast.makeText(getApplicationContext(), pesan, Toast.LENGTH_SHORT).show(); // menampilkan toast sesuai isi spinner

    }

    public void PilihPesanan(View view) {
        Intent intent = new Intent(TakeAway.this, MenuMakanan.class ); //pindah activity setelah menekan tombol Pilih Pesanan
        startActivity(intent);
    }
}
