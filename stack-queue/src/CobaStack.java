import java.util.Stack;

public class CobaStack {
  public static void main(String[] args) {
    Stack<String> barang = new Stack<>();

    // memasukan beberapa barang ke stack barang
    barang.push("sabun");
    barang.push("sampo");
    barang.push("kecap");
    barang.push("garam");

    // pop dan menampilkan stack dari barang
    System.out.println("Pop: " + barang.pop());

    // cek jika stack barang kosong
    System.out.println("Stack kosong: " + barang.isEmpty());
  }
}