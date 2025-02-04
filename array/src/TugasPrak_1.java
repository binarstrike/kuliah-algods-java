public class TugasPrak_1 {
  public static void main(String[] args) {
    String[] siswa = { "Binar", "Budi", "Ucup" };

    // mengubah isi element array pada indeks ke-1
    siswa[1] = "Otong";

    for (String namaSiswa: siswa) {
      System.out.println(namaSiswa);
    }
  }
}