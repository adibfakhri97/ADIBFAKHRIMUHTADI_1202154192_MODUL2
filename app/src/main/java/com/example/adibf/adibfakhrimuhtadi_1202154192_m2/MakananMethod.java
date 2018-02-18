package com.example.adibf.adibfakhrimuhtadi_1202154192_m2;

/**
 * Created by adibf on 2/18/2018.
 */

public class MakananMethod {
    private int id, gambar;
    private String nama, harga, komposisi;

    public MakananMethod(int id, String nama, String harga, int gambar, String komposisi){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
        this.komposisi = komposisi;
    }


    public int getId(){
        return id;
    }

    public String getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public int getGambar() {
        return gambar;
    }

    public String getKomposisi(){
        return komposisi;
    }
}
