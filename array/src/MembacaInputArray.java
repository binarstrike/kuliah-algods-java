import java.util.Scanner;

public class MembacaInputArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] siswa = new String[3];

        System.out.print("Siswa pertama: ");
        siswa[0] = scan.nextLine();
        
        System.out.print("Siswa kedua: ");
        siswa[1] = scan.nextLine();
        
        System.out.print("Siswa ketiga: ");
        siswa[2] = scan.nextLine();

        System.out.println("\nNama siswa adalah: ");
        System.out.printf("%s, %s, %s", siswa[0], siswa[1], siswa[2]);

        scan.close();
    }
}
