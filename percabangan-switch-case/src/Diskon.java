import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        float harga_produk, diskon;
        int jumlah_pembelian;
        Scanner scanMe = new Scanner(System.in);

        System.out.print("Masukan harga produk: ");
        harga_produk = scanMe.nextFloat();
        System.out.print("Masukan jumlah pemebelian: ");
        jumlah_pembelian = scanMe.nextInt();

        if (jumlah_pembelian > 10) {
            if (harga_produk > 100000)
                diskon = (15f / 100) * harga_produk;
            else
                diskon = (10f / 100) * harga_produk;
        } else {
            if (harga_produk > 50000)
                diskon = (5f / 100) * harga_produk;
            else
                diskon = (2f / 100) * harga_produk;
        }

        float total_harga = (harga_produk * jumlah_pembelian) - diskon;
        System.out.println("Total harga: " + total_harga);
        scanMe.close();
    }
}
