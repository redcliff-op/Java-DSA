public class Subset_Sum {
  static boolean isSubsetPresent(int[] arr, int n, int sum) {
    boolean[] storage = new boolean[sum + 1];
    storage[0] = true;
    for (int i = 0; i < n; i++) {
      for (int j = sum; j >= arr[i]; j--) {
        storage[j] |= storage[j - arr[i]];
      }
    }
    return storage[sum];
  }  
}
