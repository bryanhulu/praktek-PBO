package enkapsulasi.kuis_tugas;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        kucing kucing1 = new kucing();

        System.out.print("Masukkan Nama Hewan : ");
        kucing1.setNama(scanner.nextLine());

        System.out.print("Masukkan Type Hewan : ");
        kucing1.setType(scanner.nextLine());

        System.out.print("Masukkan Umur Hewan : ");
        kucing1.setUmur(scanner.nextLine());

        System.out.println("\n=== Data Hewan ===");
        System.out.println("Nama  : " + kucing1.getNama());
        System.out.println("Jenis : " + kucing1.getType());
        System.out.println("Umur  : " + kucing1.getUmur() + " tahun\n");

        kucing1.playing();
        kucing1.sleeping();

        scanner.close();
    }
}
