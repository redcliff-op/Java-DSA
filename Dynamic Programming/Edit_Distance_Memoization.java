public class Edit_Distance_Memoization{
  public static int editDistance(String s1, String s2){
    int storage[][] = new int[s1.length()+1][s2.length()+1];
    return editDistance(s1, s2, storage);
  }
  public static int editDistance(String s1, String s2, int[][] storage){
    int m = s1.length();
    int n = s2.length();
    if(m==0){
      storage[m][n] = n;
      return storage[m][n];
    }
    if(n==0){
      storage[m][n] = m;
      return storage[m][n];
    }
    if(storage[m][n]!=0){
      return storage[m][n];
    }
    if(s1.charAt(0)==s2.charAt(0)){
      storage[m][n] = editDistance(s1.substring(1), s2.substring(1),storage);
    }else{
      int insertOp = editDistance(s1, s2.substring(1), storage);
      int deleteOp = editDistance(s1.substring(1), s2, storage);
      int replaceOp = editDistance(s1.substring(1), s2.substring(1), storage);
      storage[m][n] = 1 + Math.min(insertOp, Math.min(deleteOp, replaceOp));
    }
    return storage[m][n];
  }
}
