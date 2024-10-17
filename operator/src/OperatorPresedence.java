public class OperatorPresedence {
    public static void main(String[] args) {
        float jari_jari = 10;
        float PI = 3.14f;

        // mendahulukan operasi yang ada di dalam kurung
        float luas_lingkaran = PI * (jari_jari*jari_jari);
        System.out.println("luas lingkaran dengan jari-jari 10 = "+luas_lingkaran);

        int x = 10, y = 33;

        int hasil = 23-x*x+y/(x*12);

        System.out.println("23-x*x+y/(x*12) = "+hasil);
    }
}
