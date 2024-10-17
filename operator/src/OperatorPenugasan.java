public class OperatorPenugasan {
    public static void main(String[] args) {
        // deklarasi variable num dengan tipe data int dan memberi nilai berupa angka 10
        int num = 10;

        System.out.println("nilai num = "+num);

        // menambahkan variabel num dengan 20 dan langsung memasukan nilai hasilnya ke variabel num
        num += 20;
        System.out.println("num ditambah 20 = "+num);

        num -= 5;
        System.out.println("num dikurang 5 = "+num);

        num *= 10;
        System.out.println("num dikali 10 = "+num);

        num /= 10;
        System.out.println("num dibagi 10 = "+num);
    }
}
