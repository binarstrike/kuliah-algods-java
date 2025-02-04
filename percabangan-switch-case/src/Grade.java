import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);
        int nilai;

        System.out.print("Masukan nilai: ");
        nilai = scanMe.nextInt();

        if (nilai >= 80) {
            System.out.println("Nilai A");    
            if (nilai > 90)
                System.out.println("Sempurna!!! Mantap jiwa");
        } 
        else if (nilai >= 70 && nilai < 80)
            System.out.println("Nilai B");
        else if (nilai >= 40 && nilai < 60)
            System.out.println("Nilai C");
        else
            System.out.println("Nilai D");


        scanMe.close();
    }
}
