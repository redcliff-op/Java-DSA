import java.util.Collections;
import java.util.PriorityQueue;

public class Running_Median {
  public static void findMedian(int arr[]) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (int i = 0; i < arr.length; i++) {
      addNumber(arr[i], maxHeap, minHeap);
      rebalance(maxHeap, minHeap);
      double median = getMedian(maxHeap, minHeap);
      if (median != 0 || i == 0) {
        System.out.print((int) median + " ");
      }
    }
  }

  private static void addNumber(int num, PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
    if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
      maxHeap.offer(num);
    } else {
      minHeap.offer(num);
    }
  }

  private static void rebalance(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
    while (maxHeap.size() > minHeap.size() + 1) {
      minHeap.offer(maxHeap.poll());
    }
    while (minHeap.size() > maxHeap.size()) {
      maxHeap.offer(minHeap.poll());
    }
  }

  private static double getMedian(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
    if (maxHeap.size() == minHeap.size()) {
      return (maxHeap.peek() + minHeap.peek()) / 2.0;
    } else {
      return maxHeap.peek();
    }
  }
}
