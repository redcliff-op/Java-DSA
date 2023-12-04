import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class All_Connected_Components {
  public static List<List<Integer>> findConnectedComponents(int[][] graph, int vertices) {
    List<List<Integer>> components = new ArrayList<>();
    boolean[] visited = new boolean[vertices];
    for (int i = 0; i < vertices; i++) {
      if (!visited[i]) {
        List<Integer> component = new ArrayList<>();
        dfs(graph, i, visited, component);
        components.add(component);
      }
    }
    return components;
  }
  public static void dfs(int[][] graph, int start, boolean[] visited, List<Integer> component) {
    visited[start] = true;
    component.add(start);
    for (int i = 0; i < graph.length; i++) {
      if (graph[start][i] == 1 && !visited[i]) {
        dfs(graph, i, visited, component);
      }
    }
  }

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int vertices = Integer.parseInt(str[0]);
    int edges = Integer.parseInt(str[1]);
    int[][] graph = new int[vertices][vertices];
    for (int i = 0; i < edges; i++) {
      String[] str1 = br.readLine().split(" ");
      int v1 = Integer.parseInt(str1[0]);
      int v2 = Integer.parseInt(str1[1]);
      graph[v1][v2] = 1;
      graph[v2][v1] = 1;
    }
    List<List<Integer>> components = findConnectedComponents(graph, vertices);
    for (List<Integer> component : components) {
      component.sort(null); 
      for (int vertex : component) {
        System.out.print(vertex + " ");
      }
      System.out.println();
    }
  }
}
