package com.pertemuan4.Nilai;

import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Penilaian Siswa ===");

        System.out.print("Masukkan Jumlah siswa : ");
                int jumlah = scanner.nextInt();
                double[] nilai = new double[jumlah];

                for (int i = 0; i < jumlah; i++) {
                    System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
                    nilai[i] = scanner.nextInt();
                }
                
                //total nilai
                double totalNilai = 0;
                for (int i = 0; i < jumlah; i++) {
                    totalNilai += nilai[i];
                }
                
                System.out.println("Total nilai siswa: " + totalNilai);
                
                double average = totalNilai / jumlah;
                System.out.println("Rata-rata nilai siswa: " + average);

                System.out.println("\n===NILAI MAHASISWA===");
                for (int i = 0; i < jumlah; i++) {
                    System.out.println("Nilai siswa ke-" + (i + 1) + ": " + nilai[i]);
       
                }
    }

}