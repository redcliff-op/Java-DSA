public class Longest_Consecutive_Substring{
  public static int lcs(String s, String t){
    int storage[][] = new int[s.length()+1][t.length()+1];
    return lcs(s, t,storage);
  }
  public static int lcs(String s, String t, int[][] storage) {
    int m = s.length();
    int n = t.length();
    if(s.length()==0 || t.length()==0){
      storage[m][n] = 0;
      return storage[m][n];
    }
    if(storage[m][n]!=0){
      return storage[m][n];
    }
    if(s.charAt(0)==t.charAt(0)){
      storage[m][n] = 1 + lcs(s.substring(1),t.substring(1),storage);
      return storage[m][n];
    }else{
      int op1 = lcs(s, t.substring(1),storage);
      int op2 = lcs(s.substring(1), t,storage);
      storage[m][n] = Math.max(op1, op2);
      return storage[m][n];
    }
  }
}