import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Has_Path {
  public static void hasPath(int edges[][], int sv, int target, boolean visited[]){
    int n = edges[0].length;
    Queue<Integer> temp = new LinkedList<Integer>();
    temp.add(sv);
    visited[sv] = true;
    while(!temp.isEmpty()){
      int front = temp.poll();
      if(front==target){
        System.out.println("true");
        return;
      }
      for(int i=0;i<n;i++){
        if(edges[front][i]==1 && !visited[i]){
          temp.add(i);
          visited[i] = true;
        }
      }
    }
    System.out.println("false");
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int e = s.nextInt();
    int edges[][] = new int[n][n];

    for(int i = 0; i < e; i++) {
      int fv = s.nextInt();
      int sv = s.nextInt();
      edges[fv][sv] = 1;
      edges[sv][fv] = 1;
    }

    int v1 = s.nextInt();
    int v2 = s.nextInt();
    boolean visited[] = new boolean[edges[0].length];
    hasPath(edges, v1, v2, visited);
  }
}
