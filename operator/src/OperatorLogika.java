public class OperatorLogika {
    public static void main(String[] args) {
        // deklarasi variabel dengan tipe data boolean
        boolean sudahMandi = false;
        boolean sudahMakan = true;

        // membandingkan kedua variabel dengan operator AND
        System.out.println("kamu sudah makan dan mandi? "+(sudahMakan && sudahMandi));


        System.out.println("");

        // pengecekan kondisi dengan operator pembanding negasi
        if (!sudahMandi) {
            System.out.println("kamu belum mandi!");
        } else {
            System.out.println("kamu sudah mandi");
        }
    }
}
