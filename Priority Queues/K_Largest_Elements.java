import java.util.ArrayList;
import java.util.PriorityQueue;

public class K_Largest_Elements {
  public static ArrayList<Integer> kLargest(int input[], int k) {
    if (input == null || k <= 0 || k > input.length) {
      throw new IllegalArgumentException("Invalid input");
    }
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (int i = 0; i < k; i++) {
      minHeap.offer(input[i]);
    }
    for (int i = k; i < input.length; i++) {
      if (input[i] > minHeap.peek()) {
        minHeap.poll();
        minHeap.offer(input[i]);
      }
    }
    ArrayList<Integer> result = new ArrayList<>();
    while (!minHeap.isEmpty()) {
      result.add(minHeap.poll());
    }
    return result;
  }
}
