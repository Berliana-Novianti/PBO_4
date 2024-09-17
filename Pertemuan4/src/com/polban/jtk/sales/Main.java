package com.polban.jtk.sales;

public class Main {
    public static void main(String[] args) {
        // Langkah 1: Membuat objek produk dengan stok awal 10
        Product produk = new Product("Laptop", 15000000, 10);

        // Langkah 2: Membuat objek sales
        Sales sales = new Sales(produk);

        // Langkah 3: Menjual 5 produk
        sales.jualProduk(5);

        // Langkah 4: Menambah stok produk sebanyak 10 unit
        sales.tambahStokProduk(10);

        // Langkah 5: Memperbarui harga produk
        sales.perbaruiHargaProduk(20000000);

        // Langkah 6: Mencoba memperbarui harga dengan nilai negatif
        sales.perbaruiHargaProduk(-5000);
    }
}