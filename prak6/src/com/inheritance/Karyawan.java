package com.inheritance;

public class Karyawan {
    protected String KodeKaryawan;
    protected String Nama;

    public Karyawan(String kodeKaryawan, String nama) {
        this.KodeKaryawan = kodeKaryawan;
        this.Nama = nama;
    }

    public void absenpagi() {
        System.out.println(this.Nama + " : absen pagi.");
    }

    public void kerja() {
        System.out.println(this.Nama + " : sedang bekerja.");
    }

    public void absenpulang() {
        System.out.println(this.Nama + " : absen pulang.");
    }

    public void getinfo() {
        System.out.println("Nama Karyawan : " + this.Nama);
        System.out.println("Kode Karyawan : " + this.KodeKaryawan);
    }
}
