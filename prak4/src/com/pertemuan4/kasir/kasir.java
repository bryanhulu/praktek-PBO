package com.pertemuan4.kasir;

import java.util.Scanner;

public class kasir {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Kasir Sederhana ===");
        System.out.print("Masukkan nama pembeli  : ");
                String namaPembeli = scanner.nextLine();

        System.out.print("masukkan nama produk   : ");
                String namaProduk = scanner.nextLine();

        System.out.print("masukkan harga produk  : ");
                Float hargaProduk = scanner.nextFloat();

        System.out.print("masukkan jumlah produk : ");
                int jumlahProduk = scanner.nextInt();
                
            System.out.println("\n=== Struk Pembelian ===");

        System.out.println("nama       : " + namaPembeli);
        System.out.println("produk     : " + namaProduk);
        System.out.println("harga      : " + hargaProduk);
        System.out.println("jumlah     : " + jumlahProduk);
        double totalHarga = hargaProduk * jumlahProduk;
        System.out.println("Total harga: " + totalHarga);
    }
}
