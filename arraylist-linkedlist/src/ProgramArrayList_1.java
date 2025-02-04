import java.util.ArrayList;

// Binar Nugroho - 24SA11A057
public class ProgramArrayList_1 {
  public static void main(String[] args) {
    // deklarasi
    ArrayList<Integer> arrli = new ArrayList<>();

    // Menambahkan elemen baru
    for (int i = 1; i <= 5; i++) {
      arrli.add(i);
    }

    // Mencetak ArrayList
    System.out.println(arrli);

    // menghapus elemen dari list
    arrli.remove(3);

    // Mencetak ArrayList setelah data dihapus
    System.out.println(arrli);
  }
}
