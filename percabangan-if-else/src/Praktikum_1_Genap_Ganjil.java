import java.util.Scanner;

public class Praktikum_1_Genap_Ganjil {
    public static void main(String[] args) {
        // deklarasi Scanner dan variabel bilangan
        Scanner scan = new Scanner(System.in);
        int bilangan;

        // masukan input bilangan ke variabel bilangan
        System.out.print("Masukan bilangan: ");
        bilangan = scan.nextInt();

        // bandingkan variabel bilang jika bilangan mod 2 
        // sama dengan 0 maka bilangan tersebut adalah bilangan genap
        // jika tidak maka bilangan ganjil
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan adalah genap");
        } else {
            System.out.println("Bilangan adalah ganjil");
        }

        scan.close();
    }
}
