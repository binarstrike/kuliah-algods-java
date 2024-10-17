import java.util.Scanner;

public class AritmatikaSederhana {
    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);
        // deklarasi variabel bil1 dan bil2 dengan tipe data int
        int bil1, bil2;

        // memberikan input untuk variabel bil1 dan bil2
        System.err.print("Masukan bilangan pertama: ");
        bil1 = scanMe.nextInt();
        System.err.print("Masukan bilangan kedua: ");
        bil2 = scanMe.nextInt();
        // buat variabel untuk menyimpan hasil operasi
        int hasilPenjumlahan = bil1 + bil2;
        int hasilPengurangan = bil1 - bil2;
        int hasilPerkalian = bil1 * bil2;
        int hasilPembagian = 0;

        // pengecekan kondisi jika nilai dari variabel bil2 bukan sama dengan 0
        if (bil2 != 0) {
            hasilPembagian = bil1 / bil2;
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan");
        }
        // menampilkan hasil operasi
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);        
        // pengecekan kondisi jika nilai dari variabel bil2 bukan sama dengan 0, jika true maka
        // tampilkan hasil operasi pembagian
        if (bil2 != 0) {
            System.out.println("Hasil Pembagian: " + hasilPembagian);
        }

        scanMe.close();
    }
}