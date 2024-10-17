public class OperatorBitwise {
    public static void main(String[] args) {
        int x = 12;
        int y = 10;

        System.out.printf("x = %d\ny = %d\n", x, y);
        System.out.printf("x = %s\ny = %s\n", Integer.toBinaryString(x), Integer.toBinaryString(y));
        System.out.println("");

        // menampilkan hasil operasi dengan menggunakan operator bitwise
        System.out.println("x & y = "+(x & y)); // 1100 & 1010 = 1000 = 8
        System.out.println("x | y = "+(x | y)); // 1100 | 1010 = 1000 = 14
        System.out.println("x ^ y = "+(x ^ y)); // 1100 ^ 1010 = 1000 = 6
        System.out.println("x << y = "+(x << y)); // 1100 << 1010
        System.out.println("x >> y = "+(x >> y)); // 1100 >> 1010
    }
}
