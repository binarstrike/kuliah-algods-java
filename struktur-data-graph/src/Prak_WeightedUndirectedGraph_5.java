import java.util.Arrays;

public class Prak_WeightedUndirectedGraph_5 {
  private final int[][] adjacencyMatrix;
  private final int vertices;

  Prak_WeightedUndirectedGraph_5(int vertices) {
    this.vertices = vertices;
    this.adjacencyMatrix = new int[vertices][vertices];

    for (int i = 0; i < vertices; i++) {
      Arrays.fill(adjacencyMatrix[i], Integer.MAX_VALUE);
    }
  }

  void addEdge(int source, int destination, int weight) {
    adjacencyMatrix[source][destination] = weight;
    adjacencyMatrix[destination][source] = weight;
  }

  void printMatrix() {
    System.out.println("Weighted Adjacency Matrix:");

    for (int i = 0; i < vertices; i++) {
      for (int j = 0; j < vertices; j++) {
        if (adjacencyMatrix[i][j] == Integer.MAX_VALUE) {
          System.out.print("INF\t");
        } else {
          System.out.print(adjacencyMatrix[i][j] + "\t");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int vertices = 10;
    Prak_WeightedUndirectedGraph_5 graph = new Prak_WeightedUndirectedGraph_5(vertices);

    graph.addEdge(3, 7, 1);
    graph.addEdge(5, 2, 8);
    graph.addEdge(1, 4, 9);
    graph.addEdge(8, 6, 0);
    graph.addEdge(0, 9, 3);
    graph.addEdge(7, 5, 2);
    graph.addEdge(6, 1, 4);
    graph.addEdge(4, 3, 7);
    graph.addEdge(2, 8, 5);
    graph.addEdge(9, 0, 6);

    graph.printMatrix();
  }
}
