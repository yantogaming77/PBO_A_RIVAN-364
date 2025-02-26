import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenisKelamin = scanner.nextLine().charAt(0);

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminString;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminString = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminString = "Perempuan";
        } else {
            jenisKelaminString = "Jenis kelamin tidak valid";
        }

        // Menampilkan hasil
        System.out.println("\n=== Data Diri Pengguna ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminString);
        System.out.println("Umur: " + umur + " tahun");

        // Menutup Scanner
        scanner.close();
    }
}