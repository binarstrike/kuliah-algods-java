import java.io.*;

public class SequentialSearchInt {

  public static void main(String[] args) {
    // deklarasi variabel
    int[] data = new int[] { 22, 12, 10, 5, 65, -45 };
    int cari = 0;
    int flag = 0;

    // inisiliasi BufferedReader untuk membaca input dari terminal
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Masukan data yang akan dicari: ");
    try {
      cari = Integer.parseInt(input.readLine());
    } catch (Exception _) {
      System.err.println("Data yang dimasukan bukan berupa angka");
      return;
    }

    // perulangan untuk iterasi dan memeriksa nilai yang dicari
    for (int i = 0; i < data.length; i++) {
      if (data[i] == cari) {
        flag = 1;
      }
    }

    if (flag == 1)
      System.out.println("Data ditemukan");
    else
      System.out.println("Data tidak ditemukan");
  }
}