package Latihan_Praktikum;

public class Kendaraan {

    String merk;
    String warna;

    public void dinyalakan() {
        System.out.println("Kendaraan dinyalakan.");
    }

    public void bergerak() {
        System.out.println("Kendaraan sedang bergerak.");
    }

    public void cetakInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
    }
}
