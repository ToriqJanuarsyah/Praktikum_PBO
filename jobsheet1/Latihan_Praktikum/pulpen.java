package Latihan_Praktikum;

public class pulpen extends AlatTulis {

    String jenisTinta;
    String warnaTinta;

    public void menulis() {
        System.out.println("Pulpen digunakan untuk menulis.");
    }

    public void membukaTutup() {
        System.out.println("Tutup pulpen dibuka.");
    }

    public void cetakInfo () {
        System.out.println("=== INFORMASI PULPEN ===");
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Jenis Tinta : " + jenisTinta);
        System.out.println("Warna Tinta : " + warnaTinta);
    }
}
