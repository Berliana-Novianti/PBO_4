package com.polban.jtk.sales;

public class Sales {
    private Product produk;

    // Constructor
    public Sales(Product produk) {
        this.produk = produk;
    }

    // Metode untuk menjual produk
    public void jualProduk(int jumlah) {
        System.out.println("Memproses penjualan...");
        produk.jualProduk(jumlah);
        System.out.println("Stok setelah penjualan: " + produk.getStok());
    }

    // Metode untuk menambah stok produk
    public void tambahStokProduk(int jumlah) {
        System.out.println("Menambah stok...");
        produk.tambahStok(jumlah);
        System.out.println("Stok setelah penambahan: " + produk.getStok());
    }

    // Metode untuk memperbarui harga produk
    public void perbaruiHargaProduk(double hargaBaru) {
        System.out.println("Memperbarui harga produk...");
        produk.setHarga(hargaBaru);
        System.out.println("Harga baru: " + produk.getHargaFormat());
    }
}
