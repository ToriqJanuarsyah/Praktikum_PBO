package Latihan_Praktikum;

public class motor extends Kendaraan {
     String jenisMotor;
    int kapasitasMesin;

    public void menyalakanMesin() {
        System.out.println("Mesin motor dinyalakan.");
    }

    public void mengerem() {
        System.out.println("Motor sedang mengerem.");
    }

    public void cetakInfo() {
        System.out.println("=== INFORMASI MOTOR ===");
        System.out.println("Merk             : " + merk);
        System.out.println("Warna            : " + warna);
        System.out.println("Jenis Motor      : " + jenisMotor);
        System.out.println("Kapasitas Mesin  : " + kapasitasMesin + " cc");
    }
}
