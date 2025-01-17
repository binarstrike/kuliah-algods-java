import java.util.Scanner;

public class TugasPrak_2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] siswa = new String[6];

    for (int i = 0; i < siswa.length; i++) {
      System.out.printf("Siswa ke %d: ", i);
      siswa[i] = scan.nextLine();
    }

    System.out.println("======== " + "DAFTAR NAMA SISWA " + "========");
    for (String namaSiswa : siswa) {
      System.out.println(namaSiswa);
    }

    scan.close();
  }
}
