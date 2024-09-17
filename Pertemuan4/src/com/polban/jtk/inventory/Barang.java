package com.polban.jtk.inventory;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public int getStok(){
        return stok;
    }
    public void setStok(int jumlah){
        if (jumlah > 0){
            stok += jumlah;
            System.out.println(jumlah + " stok telah ditambahkan");
        } else {
            System.out.println("Masukkan Jumlah yang benar");
        }
    }

    public String getNama_Barang(){
        return nama_barang;
    }
}
