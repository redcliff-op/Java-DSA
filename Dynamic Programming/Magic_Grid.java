public class Magic_Grid {
  public static int getMinimumStrength(int[][] grid) {
    int n = grid.length;
    int m = grid[0].length;
    int[][] storage = new int[n][m];
    storage[n - 1][m - 1] = grid[n - 1][m - 1] > 0 ? 1 : Math.abs(grid[n - 1][m - 1]) + 1;
    for (int i = n - 2; i >= 0; i--) {
      storage[i][m - 1] = Math.max(storage[i + 1][m - 1] - grid[i][m - 1], 1);
    }
    for (int j = m - 2; j >= 0; j--) {
      storage[n - 1][j] = Math.max(storage[n - 1][j + 1] - grid[n - 1][j], 1);
    }
    for (int i = n - 2; i >= 0; i--) {
      for (int j = m - 2; j >= 0; j--) {
        int minPoints = Math.min(storage[i + 1][j], storage[i][j + 1]);
        storage[i][j] = Math.max(minPoints - grid[i][j], 1);
      }
    }
    return storage[0][0];
  }
}
