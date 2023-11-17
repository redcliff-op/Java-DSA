import java.util.PriorityQueue;

public class Kth_Largest_Element {
  public static int kthLargest(int n, int[] input, int k) {
    if (input == null || k <= 0 || k > n) {
      throw new IllegalArgumentException("Invalid input");
    }
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (int i = 0; i < k; i++) {
      minHeap.offer(input[i]);
    }
    for (int i = k; i < n; i++) {
      if (input[i] > minHeap.peek()) {
        minHeap.poll();
        minHeap.offer(input[i]);
      }
    }
    return minHeap.peek();
  }
}
