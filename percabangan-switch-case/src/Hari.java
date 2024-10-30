import java.util.Scanner;

public class Hari {
    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);
        int day;

        System.out.print("Masukan hari [1-7]: ");
        day = scanMe.nextInt();

        switch (day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Angka tidak valid");
        }

        scanMe.close();
    }
}
