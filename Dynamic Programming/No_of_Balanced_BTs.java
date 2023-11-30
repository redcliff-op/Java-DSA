public class No_of_Balanced_BTs {
  static final int MOD = 1000000007;
  public static long balancedBTs(long h) {
    if (h == 0 || h == 1) {
      return 1;
    }
    long x = balancedBTs(h - 1);
    long y = balancedBTs(h - 2);
    long res = (x * ((2 * y) % MOD + x) % MOD) % MOD;
    return res;
  }
}
