package enkapsulasi.kuis_tugas;

import java.util.Scanner;

public class kucing {

    private String nama;
    private String type;
    private String umur;
    private String aktivitas;
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getUmur() {
        return umur;
    }

    public void inputdata(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Hewan : ");
        this.setNama(scanner.nextLine());

        System.out.print("Masukkan Type Hewan : ");
        this.setType(scanner.nextLine());

        System.out.print("Masukkan Umur Hewan : ");
        this.setUmur(scanner.nextLine());

            scanner.close();
    }

public void setUmur(String umurInput) {
    try {
        int umur = Integer.parseInt(umurInput);
        if (umur <= 0) {
            System.out.println("Umur harus lebih dari 0");
            return;
        }
        this.umur = umurInput;
    } catch (NumberFormatException e) {
        System.out.println("Umur harus berupa angka");
    }

    }

    public String getAktivitas() {
        return aktivitas;
    }
    public void setAktivitas(String aktivitas) {
        this.aktivitas = aktivitas;
    }
    
    public void playing() {
        System.out.println(nama + " yang berumur " + umur + " tahun Sedang bermain");
    }
    public void sleeping() {
        System.out.println(nama + " yang berumur " + umur + " tahun sedang tidur!\n");
    }

    public void showInfo() {
        System.out.println("\n=== Data Hewan ===");
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + type);
        System.out.println("Umur  : " + umur + " tahun\n");
}
}
