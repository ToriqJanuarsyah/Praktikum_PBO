package Latihan_Praktikum;

public class pensil_mekanik extends AlatTulis {

    String ukuranIsi;
    String bahanBodi;

    public void menulis() {
        System.out.println("Pensil mekanik digunakan untuk menulis.");
    }

    public void mengeluarkanIsi() {
        System.out.println("Isi pensil mekanik dikeluarkan.");
    }

    public void cetakInfo() {
        System.out.println("=== INFORMASI PENSIL MEKANIK ===");
        System.out.println("Merk       : " + merk);
        System.out.println("Warna      : " + warna);
        System.out.println("Ukuran Isi : " + ukuranIsi);
        System.out.println("Bahan Bodi : " + bahanBodi);
    }
}