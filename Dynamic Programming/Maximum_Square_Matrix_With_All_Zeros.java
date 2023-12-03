public class Maximum_Square_Matrix_With_All_Zeros {
  public static int findMaxSquareWithAllZeros(int[][] input) {
    if (input.length == 0) {
      return 0;
    }
    int n = input.length;
    int m = input[0].length;
    int storage[][] = new int[n][m];
    int maxVal = 0;
    for (int i = 0; i < n; i++) {
      storage[i][0] = input[i][0] == 0 ? 1 : 0;
      maxVal = Math.max(maxVal, storage[i][0]);
    }
    for (int j = 0; j < m; j++) {
      storage[0][j] = input[0][j] == 0 ? 1 : 0;
      maxVal = Math.max(maxVal, storage[0][j]);
    }
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < m; j++) {
        if (input[i][j] == 0) {
          storage[i][j] = 1 + Math.min(storage[i - 1][j - 1], Math.min(storage[i - 1][j], storage[i][j - 1]));
          maxVal = Math.max(maxVal, storage[i][j]);
        }
      }
    }
    return maxVal;
  }
}
