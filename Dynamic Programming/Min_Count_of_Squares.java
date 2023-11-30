public class Min_Count_of_Squares {
  public static int minCount(int n) {
    if (n <= 0) {
      return 0;
    }
    int[] result = new int[n + 1];
    result[0] = 0;
    for (int i = 1; i <= n; i++) {
      result[i] = i;
      for (int j = 1; j * j <= i; j++) {
        result[i] = Math.min(result[i], result[i - j * j] + 1);
      }
    }
    return result[n];
  }
}
