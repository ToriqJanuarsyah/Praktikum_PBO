package Latihan_Praktikum;

public class Gabungan implements Bisa_Digunakan, Bisa_Bergerak {

    String nama;
    String jenis;

    public void digunakan() {
        System.out.println("Objek sedang digunakan.");
    }

    public void bergerak() {
        System.out.println("Objek sedang bergerak.");
    }

    public void cetakInfo() {
        System.out.println("=== INFORMASI GABUNGAN ===");
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}