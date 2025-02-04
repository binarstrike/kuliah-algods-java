import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prak_ListUndirectedGraph_3 {
  private final Map<Integer, List<Integer>> adjeacencyList;

  Prak_ListUndirectedGraph_3() {
    adjeacencyList = new HashMap<>();
  }

  void addEdge(int vertex1, int vertex2) {
    adjeacencyList.computeIfAbsent(vertex1, _ -> new ArrayList<>()).add(vertex2);
    adjeacencyList.computeIfAbsent(vertex2, _ -> new ArrayList<>()).add(vertex1);
  }

  void printGraph() {
    for (Map.Entry<Integer, List<Integer>> entry : adjeacencyList.entrySet()) {
      int vertex = entry.getKey();
      List<Integer> neighbors = entry.getValue();

      System.out.print("Vertex" + vertex + ": ");

      for (int neighbor : neighbors) {
        System.out.print(neighbor + " ");
      }

      System.out.println();
    }
  }

  public static void main(String[] args) {
    Prak_ListUndirectedGraph_3 graph = new Prak_ListUndirectedGraph_3();

    graph.addEdge(1, 3);
    graph.addEdge(3, 4);
    graph.addEdge(4, 1);
    graph.addEdge(3, 5);
    graph.addEdge(2, 1);
    graph.addEdge(4, 3);
    graph.addEdge(6, 2);

    System.out.println("Adjeacency List:");
    graph.printGraph();
  }
}
