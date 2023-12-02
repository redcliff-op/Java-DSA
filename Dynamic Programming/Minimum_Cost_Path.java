public class Minimum_Cost_Path {
  public static int minCostPath(int[][] input, int i, int j, int[][] storage) {
    int m = input.length;
    int n = input[0].length;
    if(i==m-1 && j==n-1){
      storage[m-1][n-1] = input[i][j];
      return storage[i][j];
    }
    if(i>=m || j>=n){
      return Integer.MAX_VALUE;
    }
    if(storage[i][j]!=0){
      return storage[i][j];
    }
    int o1 = minCostPath(input,i,j+1, storage);
    int o2 = minCostPath(input,i+1,j+1, storage);
    int o3 = minCostPath(input,i+1,j, storage);

    storage[i][j] = input[i][j] + Math.min(o1,Math.min(o2, o3));
    return storage[i][j];
  }
  public static int minCostPath(int[][] input) {
    int storage[][] = new int[input.length][input[0].length];
    return minCostPath(input,0,0,storage);
  }
}
