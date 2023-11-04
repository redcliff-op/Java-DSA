import java.util.ArrayList;

public class Max_Priority_Queue {
  ArrayList<Integer> heap = new ArrayList<Integer>();
  boolean isEmpty() {
    return heap.size() == 0;
  }
  int getSize() {
    return heap.size();
  }
  int getMax() {
    if (heap.isEmpty()) {
      return Integer.MIN_VALUE;
    }
    return heap.get(0);
  }
  void insert(int element) {
    heap.add(element);
    int childIndex = heap.size() - 1;
    int parentIndex = (childIndex - 1) / 2;
    while (childIndex > 0) {
      if (heap.get(parentIndex) < heap.get(childIndex)) {
        int temp = heap.get(parentIndex);
        heap.set(parentIndex, heap.get(childIndex));
        heap.set(childIndex, temp);
        childIndex = parentIndex;
        parentIndex = (childIndex - 1) / 2;
      } else {
        return;
      }
    }
  }
  int removeMax() {
    if (heap.isEmpty()) {
      return Integer.MIN_VALUE;
    }
    int output = heap.get(0);
    if (heap.size() == 0) {
      heap.remove(0);
      return output;
    }
    heap.set(0, heap.get(heap.size() - 1));
    heap.remove(heap.size() - 1);
    int parentIndex = 0;
    int leftChildIndex, rightChildIndex;
    while (true) {
      leftChildIndex = 2 * parentIndex + 1;
      rightChildIndex = 2 * parentIndex + 2;
      int maxIndex = parentIndex;
      if (leftChildIndex < heap.size() && heap.get(parentIndex) < heap.get(leftChildIndex)) {
        maxIndex = leftChildIndex;
      }
      if (rightChildIndex < heap.size() && heap.get(maxIndex) < heap.get(rightChildIndex)) {
        maxIndex = rightChildIndex;
      }
      if (maxIndex == parentIndex) {
        break;
      }
      int temp = heap.get(parentIndex);
      heap.set(parentIndex, heap.get(maxIndex));
      heap.set(maxIndex, temp);

      parentIndex = maxIndex;
    }
    return output;
  }
}
