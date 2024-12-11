public class CobaMethod {
  public static void main(String[] args) {
    int z = kali(10, 5); // 10 x 5 = 50
    System.out.println(z);
    z = kali(z, 2); // 50 x 2 = 100
    System.out.println(z);

    System.out.println(kali(5, 5)); // 25
  }

  static int kali(int x, int y) {
    int hasil = x * y;
    return hasil;
  }
}
