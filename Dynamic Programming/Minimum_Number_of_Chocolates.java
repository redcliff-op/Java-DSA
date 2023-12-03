import java.util.Arrays;

public class Minimum_Number_of_Chocolates {
  public static int getMin(int arr[], int N) {
  int[] storage = new int[N];
  Arrays.fill(storage, 1);
  for (int i = 1; i < N; i++) {
    if (arr[i] > arr[i - 1]) {
      storage[i] = storage[i - 1] + 1;
    }
  }
  for (int i = N - 2; i >= 0; i--) {
    if (arr[i] > arr[i + 1]) {
      storage[i] = Math.max(storage[i], storage[i + 1] + 1);
    }
  }
  int sum = 0;
  for (int i = 0; i < N; i++) {
    sum += storage[i];
  }
  return sum;
  }
}
