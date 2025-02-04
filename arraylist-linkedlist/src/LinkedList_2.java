import java.util.LinkedList;

// Binar Nugroho - 24SA11A057
public class LinkedList_2 {
  public static void main(String[] args) {
    // membuat instance baru dari class LinkedList
    LinkedList<String> barang = new LinkedList<>();

    // menambahkan barang
    barang.add("Laptop");
    barang.add("Mie Ayam");
    barang.add("Radio");

    // cek jika data pada object barang kosong
    if (barang.isEmpty()) {
      System.out.println("Data kosong");
    } else {
      System.out.println("Data penuh");
    }

    // cek jika sebuah data atau barang terdapat di dalam LinkedList
    if (barang.contains("Seblak")) {
      System.out.println("Barang ditemukan");
    } else {
      System.out.println("Barang tidak ditemukan");
    }
  }
}
