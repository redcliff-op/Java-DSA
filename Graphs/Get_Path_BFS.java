import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Get_Path_BFS {
  public static void printShortestPath(int[][] graph, int v1, int v2) {
    Queue<Integer> queue = new LinkedList<>();
    Map<Integer, Integer> parentMap = new HashMap<>();
    boolean[] visited = new boolean[graph.length];
    queue.add(v1);
    visited[v1] = true;
    while (!queue.isEmpty()) {
      int currentVertex = queue.poll();
      for (int i = 0; i < graph.length; i++) {
        if (graph[currentVertex][i] == 1 && !visited[i]) {
          queue.add(i);
          visited[i] = true;
          parentMap.put(i, currentVertex);

          if (i == v2) {
            printPath(parentMap, v1, v2);
            return;
          }
        }
      }
    }
  }
  private static void printPath(Map<Integer, Integer> parentMap, int v1, int v2) {
    List<Integer> path = new ArrayList<>();
    int currentVertex = v2;
    while (currentVertex != v1) {
      path.add(currentVertex);
      currentVertex = parentMap.get(currentVertex);
    }
    path.add(v1);
    for (int i = 0; i < path.size(); i++) {
      System.out.print(path.get(i) + " ");
    }
  }
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int e = Integer.parseInt(str[1]);
    int[][] graph = new int[n][n];
    for (int i = 0; i < e; i++) {
      String[] str1 = br.readLine().split(" ");
      int v1 = Integer.parseInt(str1[0]);
      int v2 = Integer.parseInt(str1[1]);
      graph[v1][v2] = 1;
      graph[v2][v1] = 1;
    }
    String[] str2 = br.readLine().split(" ");
    int v1 = Integer.parseInt(str2[0]);
    int v2 = Integer.parseInt(str2[1]);
    printShortestPath(graph, v1, v2);
  }
}
