import java.util.Scanner;

public class Prak_WeightedDirectedGraph_4 {
  private final int vertices;
  private final int[][] adjacencyMatrix;

  Prak_WeightedDirectedGraph_4(int vertices) {
    this.vertices = vertices;
    this.adjacencyMatrix = new int[vertices][vertices];
  }

  void addEdge(int src, int dest, int weight) {
    adjacencyMatrix[src][dest] = weight;
  }

  void displayMatrix() {
    System.out.println("Adjacency Matrix:");

    for (int i = 0; i < vertices; i++) {
      for (int j = 0; j < vertices; j++) {
        System.out.print(adjacencyMatrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukan nomor dari vertices: ");
    int vertices = scan.nextInt();

    Prak_WeightedDirectedGraph_4 graph = new Prak_WeightedDirectedGraph_4(vertices);
    System.out.println("Masukan edges (source, destination, weight):");

    while (true) {
      System.out.print("Masukan source (-1 untuk keluar): ");
      int src = scan.nextInt();

      if (src == -1)
        break;

      System.out.print("Masukan destination: ");
      int dest = scan.nextInt();

      System.out.print("Masukan weight: ");
      int weight = scan.nextInt();

      graph.addEdge(src, dest, weight);
    }

    graph.displayMatrix();
    scan.close();
  }
}
