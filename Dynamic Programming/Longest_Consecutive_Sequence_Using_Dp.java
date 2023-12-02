public class Longest_Consecutive_Sequence_Using_Dp {
  public static int lcs(String s, String t){
    int m = s.length();
    int n = t.length();
    int storage[][] = new int[m+1][n+1];
    for(int i=0;i<=m;i++){
      storage[i][0] = 0;
    }
    for(int i=0;i<=n;i++){
      storage[0][i] = 0;
    }
    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        if(s.charAt(i-1)==t.charAt(j-1)){
          storage[i][j] = 1 + storage[i-1][j-1];
        }else{
          storage[i][j] = Math.max(storage[i-1][j], storage[i][j-1]);
        }
      }
    }
    return storage[m][n];
  }
}
