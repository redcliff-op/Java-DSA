import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Get_Path_DFS {
  public static void dfs(int[][] graph, int v, int v2, boolean[] visited, int[] path, int index) {
    visited[v] = true;
    path[index] = v;
    index++;
    if (v == v2) {
      for (int i = index - 1; i >= 0; i--) {
        System.out.print(path[i] + " ");
      }
      return;
    }
    for (int i = 0; i < graph.length; i++) {
      if (graph[v][i] == 1 && !visited[i]) {
        dfs(graph, i, v2, visited, path, index);
      }
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
    boolean[] visited = new boolean[n];
    int[] path = new int[n];
    dfs(graph, v1, v2, visited, path, 0);
  }
}
