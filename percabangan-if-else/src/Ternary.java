public class Ternary {
    public static void main(String[] args) {
        // deklarasi variabel hargaTas dan budget
        int hargaTas = 12000000;
        int budget = 500000;

        // membandingkan harga tas dengan budget
        // menggunakan percabangan atau operator ternary
        String beliTas = budget < hargaTas
                ? "Tidak jadi beli tas, terlalu mahal"
                : "Gass beli tas nya";

        System.out.println(beliTas);
    }
}
