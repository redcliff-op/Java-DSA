import java.util.ArrayList;
import java.util.PriorityQueue;

public class K_Smallest_Elements {
  public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
    if (input == null || k <= 0 || k > n) {
      throw new IllegalArgumentException("Invalid input");
    }
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
    for (int i = 0; i < k; i++) {
      maxHeap.offer(input[i]);
    }
    for (int i = k; i < n; i++) {
      if (input[i] < maxHeap.peek()) {
        maxHeap.poll();
        maxHeap.offer(input[i]);
      }
    }
    ArrayList<Integer> result = new ArrayList<>();
    while (!maxHeap.isEmpty()) {
      result.add(maxHeap.poll());
    }
    return result;
  }
}
