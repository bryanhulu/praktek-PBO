package com.pertemuan4.tugas4;

import java.util.ArrayList;
import java.util.Scanner;

public class buku {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarBelanja = new ArrayList<String>();

        System.out.println("=== Daftar Koleksi Buku ===");
        System.out.println("Ketik nama buku, kalau sudah selesai ketik 'selesai'");

        while (true) {
            System.out.print("Masukkan nama buku: ");
            String namaBarang = scanner.nextLine();
            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }
            daftarBelanja.add(namaBarang);            
        }
        System.out.println("\n=== Daftar Koleksi Buku ===");
        for (int i = 0; i < daftarBelanja.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBelanja.get(i));
        }
    }
    
}
