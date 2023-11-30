public class Staircase {
  public static long staircase(int n) {
    long ways[] = new long[n+1];
    ways[0] = 1;
    for(int i=1;i<=n;i++){
      ways[i] += ways[i-1];
      if(i>=2){
        ways[i] += ways[i-2];
      }
      if(i>=3){
        ways[i] += ways[i-3];
      }
    }
    return ways[n];
  }
}
