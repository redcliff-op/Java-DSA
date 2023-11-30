public class Coin_Tower {
  public static String findWinner(int n, int x, int y) {
    boolean[] dp = new boolean[n + 1];
    dp[0] = false;
    dp[1] = true;
    for (int i = 2; i <= n; i++) {
      dp[i] = !dp[i - 1];
      if (i - x >= 0 && !dp[i - x]) {
        dp[i] = true;
      }
      else if (i - y >= 0 && !dp[i - y]) {
        dp[i] = true;
      }
    }
    if (dp[n]) {
      return "Beerus";
    } else {
      return "Whis";
    }
  }
}
