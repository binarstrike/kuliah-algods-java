import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] nilai = { 66, 77, 80, 84, 88, 99, 100, 101, 129, 145, 204 };

    // menggunakan scanner untuk memasukan
    // nilai yang akan dicari
    System.out.print("Masukan nilai yang dicari: ");
    int cari = scan.nextInt();

    BinarySearchInt(nilai, cari);
    scan.close();
  }

  public static void BinarySearchInt(int[] angka, int key) {
    int low = 0, high = angka.length - 1, median;
    boolean status = false;

    while (low <= high) {
      median = (low + high) / 2;

      int x = angka[median];
      @SuppressWarnings("unused")
      int i = x;

      if (key == angka[median]) {
        System.out.printf("%d ditemukan pada posisi ke-%d dan pada indeks ke-%d", key, median + 1, median);
        status = true;
        break;
      } else {
        // jika data tidak ditemukan lakukan pengecekan apakah key lebih dari
        // angka[median]
        // jika ya maka ubah nilai variabel low menjadi median + 1
        if (key > angka[median]) {
          low = median + 1;
        } else {
          // jika angka[median] lebih besar dari key
          high = median - 1;
        }
      }
    }

    if (!status) {
      System.out.println(key + " tidak ditemukan dalam array");
    }
  }
}
