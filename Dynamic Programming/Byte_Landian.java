import java.util.HashMap;

public class Byte_Landian {
  public static long bytelandian(long n, HashMap<Long, Long> memo) {
    if (n == 0) {
      return 0;
    }
    if (memo.containsKey(n)) {
      return memo.get(n);
    }
    long maxDollars = Math.max(n, bytelandian(n / 2, memo) + bytelandian(n / 3, memo) + bytelandian(n / 4, memo));
    memo.put(n, maxDollars);
    return maxDollars;
  }
}
