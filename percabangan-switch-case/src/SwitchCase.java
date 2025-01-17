import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String lampu;
        Scanner scanMe = new Scanner(System.in);

        System.out.print("Masukan warna lampu: ");
        lampu = scanMe.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu berwarna merah, berhenti wooyy!!");
                break;
            case "kuning":
                System.out.println("Lampu berwarna kuning, harap berhati-hati jangan meleng");
                break;
            case "hijau":
                System.out.println("gasss pollll!!!");
                break;
            default:
                System.out.println("Warna lampu tidak dikenali");
        }

        scanMe.close();
    }
}
