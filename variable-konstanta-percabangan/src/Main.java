import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama, nim, prodi;
        char confirmProdi;

        Scanner scanMe = new Scanner(System.in);

        prompt("Masukan nama: ");
        nama = scanMe.nextLine();
        prompt("Masukan NIM: ");
        nim = scanMe.nextLine();

        System.out.println("Program Studi");
        System.out.println("1. Informatika\n2. Teknologi Informasi\n3. Sistem Informasi");
        prompt("Masukan pilihan prodi [1-3]: ");
        confirmProdi = scanMe.next().charAt(0);

        // if (confirm == '1') {
        //     prodi = "Informatika";
        // } else if (confirm == '2') {
        //     prodi = "Teknologi Informasi";
        // } else if (confirm == '2') {
        //     prodi = "Sistem Informasi";
        // } else {
        //     prodi = "Kamu tidak memilih prodi";
        // }

        prodi = switch (confirmProdi) {
            case '1' -> "Informatika";
            case '2' -> "Teknologi Informasi";
            case '3' -> "Sistem Informasi";
            default -> "Kamu tidak memilih prodi";
        };

        System.out.println("");
        System.out.println("=".repeat(20));
        System.out.println("== Data Mahasiswa ==");
        System.out.println("=".repeat(20));
        System.out.printf("Nama Aku: %s\nNIM: %s\nProdi: %s\n\n", nama, nim, prodi);

        scanMe.close();
    }

    private static void prompt(String p) {
        System.out.print(p);
    }
}
