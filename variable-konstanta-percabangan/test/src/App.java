
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("input you name: ");
        String nama = scan.nextLine();

        PrintMyName(nama);

        scan.close();

    }

    private static void PrintMyName(String name) {
        System.out.println("My name is ".concat(name));
    }
}
