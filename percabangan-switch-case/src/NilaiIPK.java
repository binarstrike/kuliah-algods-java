import java.util.Scanner;

public class NilaiIPK {
    public static void main(String[] args) {
        String nama;
        float nilaiIPK;

        Scanner scanMe = new Scanner(System.in);

        System.out.print("Masukan nama kamu: ");
        nama = scanMe.nextLine();

        System.out.print("Masukan nilai IPK: ");
        nilaiIPK = scanMe.nextFloat();

        if (nilaiIPK >= 3.5)
            System.out.println("Cumlaude");
        else if (nilaiIPK >= 3.0)
            System.out.println("Sangat memuaskan!!");
        else if (nilaiIPK >= 2.5)
            System.out.println("Memuaskan");
        else if (nilaiIPK >= 2.0)
            System.out.println("Cukup");
        else
            System.out.println("Tidak lulus");

        scanMe.close();
    }
}
