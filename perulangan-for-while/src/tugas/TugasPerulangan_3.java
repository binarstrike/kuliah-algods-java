package tugas;

import java.util.Scanner;

public class TugasPerulangan_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;

        System.out.print("Masukan angka (0 untuk berhenti): ");
        input = scan.nextInt();
        
        while (input != 0) {
            System.out.println("Anda memasukan: " + input);
            System.out.print("Masukan angka (0 untuk berhenti): ");
            input = scan.nextInt();
        }
        System.out.println("Terimakasih sudah menggunakan program ini!");
        scan.close();
    }
}
