import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Traversal {
  public static void printHelper(int edges[][], int sv,boolean visited[]){
    int n = edges[0].length;
    Queue<Integer> temp = new LinkedList<Integer>();
    temp.add(sv);
    visited[sv] = true;
    while(!temp.isEmpty()){
      int front = temp.poll();
      System.out.print(front + " ");
      for(int i=0;i<n;i++){
        if(edges[front][i]==1 && !visited[i]){
          temp.add(i);
          visited[i] = true;
        }
      }
    }
  }
  public static void print(int edges[][]){
    boolean visited[] = new boolean[edges.length];
    for(int i=0;i<edges.length;i++){
      if(!visited[i]){
        printHelper(edges,i,visited);
      }
    }
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int V = s.nextInt();
    int E = s.nextInt();
    int edges[][] = new int[V][V];
    for(int i = 0; i < E; i++) {
      int fv = s.nextInt();
      int sv = s.nextInt();
      edges[fv][sv] = 1;   
      edges[sv][fv] = 1;
    }
    print(edges);
    s.close();
  }
}
