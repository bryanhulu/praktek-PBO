package com.Overriding;

public class App {
    public static void main(String[] args) {
    BangunDatar BangunDatar = new BangunDatar();
    Lingkaran el = new Lingkaran(7);

    BangunDatar.luas();
    BangunDatar.keliling();

    System.out.println("Luas Lingkaran: " + el.luas());
    System.out.println("Keliling Lingkaran: " + el.keliling());
}
}
