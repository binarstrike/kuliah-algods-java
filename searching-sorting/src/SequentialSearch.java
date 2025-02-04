import java.util.Scanner;

public class SequentialSearch {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukan berapa data yang diinginkan: ");
    int panjangData = scan.nextInt();
    int data[] = new int[panjangData];

    for (int i = 0; i < panjangData; i++) {
      System.out.printf("data [%d] = ", i + 1);
      data[i] = scan.nextInt();
    }

    System.out.println("-".repeat(20));
    System.out.print("data array = ");
    for (int d : data) {
      System.out.print(d + " ");
    }

    System.out.printf("\n", "-".repeat(20), "\n");
    System.out.print("masukan data yang dicari = ");
    int cari = scan.nextInt();
    int x = 0;
    boolean ketemu = false;

    for (int i = 0; i < panjangData; i++) {
      if (data[i] == cari) {
        ketemu = true;
        x = i;
      }
    }

    if (ketemu) {
      System.out.printf("data ditemukan pada urutan ke-%d indeks ke-%d", x + 1, x);
    } else {
      System.out.println("data tidak ditemukan");
    }

    scan.close();
  }
}
