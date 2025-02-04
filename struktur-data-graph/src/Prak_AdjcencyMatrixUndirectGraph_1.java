public class Prak_AdjcencyMatrixUndirectGraph_1 {
  static int[][] createGraph(int numVertices) {
    return new int[numVertices][numVertices];
  }

  static void addGraph(int[][] graph, int vertex1, int vertex2) {
    graph[vertex1][vertex2] = 1;
    graph[vertex2][vertex1] = 1;
  }

  static void displayGraph(int[][] graph) {
    for (int i = 0; i < graph.length; i++) {
      for (int j = 0; j < graph[0].length; j++) {
        System.out.print(graph[i][j] + " ");
      }
      System.out.println("");
    }
  }

  // Binar Nugroho - 24SA11A057
  public static void main(String[] args) {
    int numVertices = 10;
    int[][] graph = createGraph(numVertices);

    addGraph(graph, 0, 2);
    addGraph(graph, 1, 3);
    addGraph(graph, 2, 4);
    addGraph(graph, 6, 7);
    addGraph(graph, 9, 3);

    displayGraph(graph);
  }
}
