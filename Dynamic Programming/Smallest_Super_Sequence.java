public class Smallest_Super_Sequence {
  public static int smallestSuperSequence(String str1, String str2) {
    int m = str1.length();
    int n = str2.length();
    int[][] storage = new int[m + 1][n + 1];
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0 || j == 0) {
          storage[i][j] = 0;
        } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
          storage[i][j] = storage[i - 1][j - 1] + 1;
        } else {
          storage[i][j] = Math.max(storage[i - 1][j], storage[i][j - 1]);
        }
      }
    }
    int lcs = storage[m][n];
    return m + n - lcs;
  }
}
