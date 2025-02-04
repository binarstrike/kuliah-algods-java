import java.util.ArrayList;

public class Tugas_Praktikum_1 {

    public static void main(String[] args) {
        ArrayList<String> barangBelanjaan = new ArrayList<String>();

        barangBelanjaan.add("Sabun");
        barangBelanjaan.add("Detergen");
        barangBelanjaan.add("Pasta Gigi");
        barangBelanjaan.add("Minyak Goreng");

        for (String item : barangBelanjaan) {
            System.out.println(item);
        }
    }
}
