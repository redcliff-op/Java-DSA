import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Is_Connected {
  public static boolean isConnected(int[][] graph, int vertices) {
    boolean[] visited = new boolean[vertices];
    dfs(graph, 0, visited);
    for (boolean v : visited) {
      if (!v) {
        return false;
      }
    }
    return true;
  }
  public static void dfs(int[][] graph, int start, boolean[] visited) {
    Stack<Integer> stack = new Stack<>();
    stack.push(start);
    visited[start] = true;
    while (!stack.isEmpty()) {
      int currentVertex = stack.pop();
      for (int i = 0; i < graph.length; i++) {
        if (graph[currentVertex][i] == 1 && !visited[i]) {
          stack.push(i);
          visited[i] = true;
        }
      }
    }
  }
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int vertices = Integer.parseInt(str[0]);
    int edges = Integer.parseInt(str[1]);
    if (vertices == 0) {
      System.out.println("true");
      return;
    }
    int[][] graph = new int[vertices][vertices];
    for (int i = 0; i < edges; i++) {
      String[] str1 = br.readLine().split(" ");
      int v1 = Integer.parseInt(str1[0]);
      int v2 = Integer.parseInt(str1[1]);
      graph[v1][v2] = 1;
      graph[v2][v1] = 1;
    }
    boolean result = isConnected(graph, vertices);
    System.out.println(result);
  }
}
