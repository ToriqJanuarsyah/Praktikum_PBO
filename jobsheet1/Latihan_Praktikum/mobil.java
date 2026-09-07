package Latihan_Praktikum;

public class mobil extends Kendaraan {

    String jenisMobil;
    int jumlahPintu;

    public void menyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan.");
    }

    public void membukaPintu() {
        System.out.println("Pintu mobil dibuka.");
    }

    public void cetakInfo() {
        System.out.println("=== INFORMASI MOBIL ===");
        System.out.println("Merk         : " + merk);
        System.out.println("Warna        : " + warna);
        System.out.println("Jenis Mobil  : " + jenisMobil);
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}