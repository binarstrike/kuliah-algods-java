import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        float harga,diskon,total;

        Scanner scanMe = new Scanner(System.in);

        // memberi input berupa harga dan jumlah diskon dalam bentuk persen
        System.out.print("Masukan harga: ");
        harga = scanMe.nextFloat();
        System.out.print("Masukan diskon %: ");
        diskon = scanMe.nextFloat();

        // menghitung jumlah diskon yang di dapat dan mengurangi nya dengan harga
        total = harga - ((diskon/100) * harga);

        System.out.println("harga = "+harga);
        System.out.printf("diskon = %.1f%%\n", diskon);
        System.out.println("total harga = "+total);

        scanMe.close();
    }
}
