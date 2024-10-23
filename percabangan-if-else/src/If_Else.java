public class If_Else {
    public static void main(String[] args) throws Exception {
        boolean ucupSudahMandi = false;
        String p1 = "Ucup";


        if (!ucupSudahMandi) {
            System.out.printf("%s belum mandi\n", p1);
        } else {
            System.out.printf("%s sudah mandi\n", p1);
        }


        int hargaTas = 1000000;

        if (hargaTas > 100000000) {
            System.out.println("Tas nya mahal wooyyy");
        } else {
            System.out.println("Tas nya murah beli aahh...");
        }
    }
}
