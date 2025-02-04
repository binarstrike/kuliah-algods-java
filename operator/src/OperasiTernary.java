public class OperasiTernary {
    public static void main(String[] args) {
        // deklarasi variabel dengan tipe data boolean
        boolean ucupSudahMandi = false;

        // membandingkan nilai boolean dengan operator ternary dan memasukan nilai string ke variabel s
        String s = !ucupSudahMandi ? "Ucup belum mandi" : "Ucup sudah mandi";

        System.out.println(s);
    }
}
