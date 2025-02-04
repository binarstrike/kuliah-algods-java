import java.util.Scanner;

public class KalkulatorSuhu {
    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);

        float suhuCelcius;

        // memberi input masukan berupa angka atau suhu celcius dan menyimpan nya pada
        // variabel suhuCelcius
        System.out.print("Masukan nilai suhu celcius: ");
        suhuCelcius = scanMe.nextFloat();

        // menghitung hasil konversi menggunakan rumus konversi suhu
        float fah = (suhuCelcius * 9 / 5) + 32;
        float ream = suhuCelcius * 4 / 5;
        float kelvin = suhuCelcius + 273.15f;

        // menampilkan hasil konversi suhu
        System.out.println("hasil konversi celcius ke fahreinheit");
        System.out.printf("-----> %f Celcius = %.2f Fahreinheit\n", suhuCelcius, fah);
        System.out.println("hasil konversi celcius ke reamur");
        System.out.printf("-----> %f Celcius = %.2f Reamur\n", suhuCelcius, ream);
        System.out.println("hasil konversi celcius ke kelvin");
        System.out.printf("-----> %f Celcius = %.2f Kelvin\n", suhuCelcius, kelvin);

        scanMe.close();
    }
}
