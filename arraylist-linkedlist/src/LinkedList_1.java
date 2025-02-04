import java.util.LinkedList;

public class LinkedList_1 {
  public static void main(String[] args) {
    LinkedList<String> buah = new LinkedList<>();

    // Binar Nugroho - 24SA11A057
    // menambahkan data berupa nama buah pada objek LinkedList buah
    buah.add("Durian");
    buah.add("Batagor");
    buah.add("Melon");
    buah.add("Jeruk");
    buah.add("Salak");
    buah.add("Seblak");
    buah.add("Cilor");
    buah.add("Anggur");

    // menampilkan data
    System.out.println("Saya suka makan buah" + buah);

    System.out.println("Di rumah saya setiap harinya menyediakan " + buah.size() + " macam buah-buahan");
  }
}
