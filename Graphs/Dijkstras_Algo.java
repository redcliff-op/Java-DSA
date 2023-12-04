import java.util.Scanner;

public class Dijkstras_Algo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numVertices = sc.nextInt();
    int numEdges = sc.nextInt();
    int[][] graph = new int[numVertices][numVertices];
    int vertex1, vertex2, cost;
    while (numEdges > 0) {
      numEdges--;
      vertex1 = sc.nextInt();
      vertex2 = sc.nextInt();
      cost = sc.nextInt();
      graph[vertex1][vertex2] = cost;
      graph[vertex2][vertex1] = cost;
    }
    int[] distances = new int[numVertices];
    boolean[] visited = new boolean[numVertices];
    for (int i = 1; i < numVertices; i++)
      distances[i] = Integer.MAX_VALUE;
    int source = 0;
    for (int i = 0; i < numVertices; i++) {
      source = findMinVertex(distances, visited);
      visited[source] = true;
      for (int j = 0; j < numVertices; j++) {
        if (graph[source][j] > 0 && !visited[j] && distances[j] > distances[source] + graph[source][j]) {
          distances[j] = distances[source] + graph[source][j];
        }
      }
    }
    printDistances(distances);
  }
  public static int findMinVertex(int[] distances, boolean[] visited) {
    int vertex, minDistance, numVertices;
    minDistance = Integer.MAX_VALUE;
    numVertices = distances.length;
    vertex = -1;
    for (int i = 0; i < numVertices; i++) {
      if (minDistance > distances[i] && !visited[i]) {
        minDistance = distances[i];
        vertex = i;
      }
    }
    return vertex;
  }
  public static void printDistances(int[] distances) {
    for (int i = 0; i < distances.length; i++) {
      System.out.println(i + " " + distances[i]);
    }
  }
}
