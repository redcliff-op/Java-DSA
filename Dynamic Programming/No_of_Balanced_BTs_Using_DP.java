public class No_of_Balanced_BTs_Using_DP {
  public static int MOD = 1000000007;
  public static int balancedBTs(int height){
    long result[] = new long[height+1];
    result[0] = 1;
    result[1] = 1;
    for(int i=2;i<=height;i++){
      result[i] = (result[i - 1] * (2L * result[i - 2] + result[i - 1])) % MOD;
    }
    return (int)result[height]%MOD;
  }
}
