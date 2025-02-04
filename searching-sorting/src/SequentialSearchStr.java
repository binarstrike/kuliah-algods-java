public class SequentialSearchStr {
  public static void main(String[] args) {
    SequentialSearchStr obj = new SequentialSearchStr();
    obj.tampilkanData();
    obj.searching("Ucup");
  }

  String[] dataNama = new String[] { "Budi", "Dika", "Ucup", "Otong", "Ani", "Siti", "Fufu" };

  private void searching(String karakter) {
    int x = 0;
    boolean ketemu = false;

    for (int i = 0; i < dataNama.length; i++) {
      if (karakter.equalsIgnoreCase(dataNama[i])) {
        ketemu = true;
        x = i;
      }
    }

    if (ketemu)
      System.out.printf("Data ditemukan pada urutan ke-%d indeks ke-%d", x + 1, x);
    else
      System.out.println("Data tidak ditemukan");
  }

  private void tampilkanData() {
    for (String nama : dataNama) {
      System.out.print(nama + " ");
    }
    System.out.println();
  }
}
