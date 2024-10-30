import java.util.Scanner;

public class Umur {
    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);
        int umur;

        System.out.print("Masukan umur kamu: ");
        umur = scanMe.nextInt();

        if (umur < 13)
            System.out.println("Kamu masih bocil!!");
        else if (umur >= 13 && umur < 20)
            System.out.println("Kamu sudah remaja");
        else
            System.out.println("Kamu dah gede alias dewasa");

        scanMe.close();
    }
}
