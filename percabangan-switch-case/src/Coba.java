import java.io.PrintWriter;

public class Coba {
    public static void main(String[] args) {
        PrintWriter w = new PrintWriter(System.out);

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                w.write("@");
            }
            w.write("\n");
            w.flush();
        }

        w.close();
    }
}
