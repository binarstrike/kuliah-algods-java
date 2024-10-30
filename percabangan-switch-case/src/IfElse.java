import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        // deklarasi variabel yang dibutuhkan
        int nilai;
        String grade;
        Scanner scanMe = new Scanner(System.in);

        // masukan nilai dan simpan ke variabel nilai
        System.out.print("Masukan nilai: ");
        nilai = scanMe.nextInt();

        // gunakan if else untuk membandingkan variabel
        // nilai dan menentukan grade
        if (nilai >= 90)
            grade = "A";
        else if (nilai >= 80)
            grade = "B+";
        else if (nilai >= 70)
            grade = "B";
        else if (nilai >= 60)
            grade = "C+";
        else if (nilai >= 50)
            grade = "D+";
        else if (nilai >= 40)
            grade = "D";
        else
            grade = "E";

        System.out.println("Grade kamu = " + grade);

        scanMe.close();
    }
}