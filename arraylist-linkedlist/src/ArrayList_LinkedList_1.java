import java.util.LinkedList;

// Binar Nugroho - 24SA11A057
public class ArrayList_LinkedList_1 {
  public static void main(String[] args) {
    // deklarasi
    LinkedList<String> obj = new LinkedList<>();

    // Menambahkan elemen baru
    obj.add("A");
    obj.add("B");
    obj.addLast("C");

    System.out.println(obj);

    // menghapus elemen dari LinkedList
    obj.remove("B");
    obj.removeFirst();

    System.out.println("Linked list setelah operasi deletion: " + obj);
  }
}
