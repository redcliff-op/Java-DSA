public class Knapsack_DP {
  public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
    int[][] storage = new int[n + 1][maxWeight + 1];
    for (int i = 1; i <= n; i++) {
      for (int w = 1; w <= maxWeight; w++) {
        if (weights[i - 1] <= w) {
          storage[i][w] = Math.max(values[i - 1] + storage[i - 1][w - weights[i - 1]], storage[i - 1][w]);
        } else {
          storage[i][w] = storage[i - 1][w];
        }
      }
    }
    return storage[n][maxWeight];
  }
}
