package com.example.a451lb.agung_1202152179_modul2;

public class pilihanmenu {
    int gambar;
    String nama;
    int harga;
    String komposisi;

    public pilihanmenu(int gambar, String nama, int harga, String komposisi) {
        this.gambar = gambar;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    public int getGambar() {
        return gambar;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKomposisi(){return komposisi;}
}
