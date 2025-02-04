import java.util.ArrayList;
import java.util.List;

class Edge {
  int dest, weight;

  Edge(int dest, int weight) {
    this.dest = dest;
    this.weight = weight;
  }
}

class GraphList {
  int vertices;
  List<List<Edge>> adjacencyList;

  GraphList(int vertices) {
    this.vertices = vertices;
    this.adjacencyList = new ArrayList<>();

    for (int i = 0; i < vertices; i++) {
      this.adjacencyList.add(new ArrayList<>());
    }
  }

  void addEdge(int vertex1, int vertex2, int weight) {
    Edge edge1 = new Edge(vertex2, weight);
    this.adjacencyList.get(vertex1).add(edge1);

    Edge edge2 = new Edge(vertex1, weight);
    this.adjacencyList.get(vertex2).add(edge2);
  }

  void printAdjacencyList() {
    for (int i = 0; i < this.vertices; i++) {
      System.out.printf("Vertex %d: ", i);

      for (Edge edge : this.adjacencyList.get(i)) {
        System.out.printf("(%d,%d)", edge.dest, edge.weight);
      }

      System.out.println("");
    }
  }
}

// Binar Nugroho - 24SA11A057
public class Prak_WeightedUndirectedGraph_ListAdj_6 {
  public static void main(String[] args) {
    // membuat instance baru dari class GraphList
    GraphList graph = new GraphList(5);

    // menambahkan edges dengan weights
    graph.addEdge(0, 3, 2);
    graph.addEdge(4, 2, 1);
    graph.addEdge(3, 1, 4);
    graph.addEdge(4, 3, 3);
    graph.addEdge(2, 0, 2);

    // menampilkan adjacency list
    graph.printAdjacencyList();
  }
}
