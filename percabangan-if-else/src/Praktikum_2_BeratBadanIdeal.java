import java.util.Scanner;

public class Praktikum_2_BeratBadanIdeal {
    public static void main(String[] args) {
        // deklarasi Scanner dan variabel lainnya yang diperlukan
        Scanner scan = new Scanner(System.in);
        char jenisKelamin;
        double tinggiBadan = 0, beratBadanIdeal = 0;

        // memasukan jenis kelamin dan tinggi badan pada masing-masing variabel
        System.out.print("Masukan jenis kelamin [L/l/P/p]: ");
        jenisKelamin = scan.nextLine().charAt(0);
        System.out.print("Masukan tinggi badan: ");
        tinggiBadan = scan.nextDouble();

        // membandingkan jenis kelamin untuk menentukan cara menghitung berat
        // badan ideal masing-masing jenis kelamin dan memasukan hasil perhitungan
        // ke variabel beratBadanIdeal
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            beratBadanIdeal = (tinggiBadan - 100) - (0.1 * (tinggiBadan - 100));
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            beratBadanIdeal = (tinggiBadan - 100) - (0.15 * (tinggiBadan - 100));
        } else {
            // tampilkan pesan kesalahan jika salah memasukan jenis kelamin
            System.err.println("Kamu salah memasukan jenis kelamin!");
            scan.close();

            return;
        }

        // tampilkan hasil perehitungan beran badan ideal
        System.out.printf("Berat badan ideal %.2f\n", beratBadanIdeal);

        scan.close();
    }
}
