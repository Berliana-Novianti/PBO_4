package com.polban.jtk.sales;

import java.text.DecimalFormat;

public class Product {
    // Atribut private untuk enkapsulasi
    private String namaProduk;
    private double harga;
    private int stok;

    // Constructor
    public Product(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter dan Setter untuk atribut private
    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public String getHargaFormat() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(harga);
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    public int getStok() {
        return stok;
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println("Jumlah stok tidak valid!");
        }
    }

    public void jualProduk(int jumlah) {
        if (jumlah > 0 && jumlah <= stok) {
            stok -= jumlah;
            System.out.println(jumlah + " " + namaProduk + " terjual.");
        } else {
            System.out.println("Jumlah stok tidak cukup untuk penjualan.");
        }
    }
}
