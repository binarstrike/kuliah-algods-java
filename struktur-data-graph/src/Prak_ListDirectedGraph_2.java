import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Graph {
  private final List<Integer> vertices;
  private final Map<Integer, List<Integer>> adjacencyList;

  Graph() {
    vertices = new ArrayList<>();
    adjacencyList = new HashMap<>();
  }

  void addVertex(int vertex) {
    if (!this.vertices.contains(vertex)) {
      this.vertices.add(vertex);
      this.adjacencyList.put(vertex, new ArrayList<>());
    }
  }

  void addEdge(int vec1, int vec2) {
    if (this.vertices.contains(vec1) && this.vertices.contains(vec2)) {
      List<Integer> list1 = this.adjacencyList.get(vec1);
      list1.add(vec2);
    } else {
      System.out.println("Vertex tidak ditemukan!");
    }
  }

  void displayGraph() {
    for (int vertex : this.vertices) {
      List<Integer> neighbors = this.adjacencyList.get(vertex);
      System.out.print(vertex + " -> ");

      for (int neighbor : neighbors) {
        System.out.print(neighbor + " ");

      }
      System.out.println();
    }
  }
}

public class Prak_ListDirectedGraph_2 {
  public static void main(String[] args) {
    Graph graph = new Graph();

    // menambahakan vertices
    graph.addVertex(4);
    graph.addVertex(3);
    graph.addVertex(2);
    graph.addVertex(1);

    // menambahakan edges
    graph.addEdge(2, 1);
    graph.addEdge(3, 1);
    graph.addEdge(3, 2);
    graph.addEdge(4, 3);

    // menampilkan graph
    graph.displayGraph();
  }
}
