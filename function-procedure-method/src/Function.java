import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Function {
  static ArrayList<String> listBuah = new ArrayList<>();
  static boolean isRunning = true;
  static InputStreamReader isr = new InputStreamReader(System.in);
  static BufferedReader input = new BufferedReader(isr);

  public static void main(String[] args) {
    hello("ucup");
  }

  static void hello(String name) {
    System.out.println("hello " + name);
  }
}
