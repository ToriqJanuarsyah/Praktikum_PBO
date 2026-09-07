package Latihan_Praktikum;

public class Demo {

    public static void main(String[] args) {

        // =========================================
        // OBJEK ALAT TULIS
        // =========================================
        AlatTulis alatTulis = new AlatTulis();
        alatTulis.merk = "Standard";
        alatTulis.warna = "Hitam";

        System.out.println("=== ALAT TULIS ===");
        alatTulis.digunakan();
        alatTulis.disimpan();
        alatTulis.cetakInfo();


        // =========================================
        // OBJEK PULPEN
        // =========================================
        pulpen pulpen = new pulpen();
        pulpen.merk = "Pilot";
        pulpen.warna = "Biru";
        pulpen.jenisTinta = "Gel";
        pulpen.warnaTinta = "Biru";

        System.out.println("\n=== PULPEN ===");
        pulpen.digunakan();
        pulpen.disimpan();
        pulpen.menulis();
        pulpen.membukaTutup();
        pulpen.cetakInfo();


        // =========================================
        // OBJEK PENSIL MEKANIK
        // =========================================
        pensil_mekanik pensil = new pensil_mekanik();
        pensil.merk = "Faber-Castell";
        pensil.warna = "Hitam";
        pensil.ukuranIsi = "0.5 mm";
        pensil.bahanBodi = "Plastik";

        System.out.println("\n=== PENSIL MEKANIK ===");
        pensil.digunakan();
        pensil.disimpan();
        pensil.menulis();
        pensil.mengeluarkanIsi();
        pensil.cetakInfo();


        // =========================================
        // OBJEK KENDARAAN
        // =========================================
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.merk = "Umum";
        kendaraan.warna = "Hitam";

        System.out.println("\n=== KENDARAAN ===");
        kendaraan.dinyalakan();
        kendaraan.bergerak();
        kendaraan.cetakInfo();


        // =========================================
        // OBJEK MOTOR
        // =========================================
        motor motor = new motor();
        motor.merk = "Honda";
        motor.warna = "Merah";
        motor.jenisMotor = "Matic";
        motor.kapasitasMesin = 125;

        System.out.println("\n=== MOTOR ===");
        motor.dinyalakan();
        motor.bergerak();
        motor.menyalakanMesin();
        motor.mengerem();
        motor.cetakInfo();


        // =========================================
        // OBJEK MOBIL
        // =========================================
        mobil mobil = new mobil();
        mobil.merk = "Toyota";
        mobil.warna = "Putih";
        mobil.jenisMobil = "MPV";
        mobil.jumlahPintu = 5;

        System.out.println("\n=== MOBIL ===");
        mobil.dinyalakan();
        mobil.bergerak();
        mobil.menyalakanMesin();
        mobil.membukaPintu();
        mobil.cetakInfo();


        // =========================================
        // OBJEK GABUNGAN
        // =========================================
        Gabungan gabungan = new Gabungan();
        gabungan.nama = "Objek Gabungan";
        gabungan.jenis = "Benda dan Kendaraan";

        System.out.println("\n=== GABUNGAN ===");
        gabungan.digunakan();
        gabungan.bergerak();
        gabungan.cetakInfo();
    }
}