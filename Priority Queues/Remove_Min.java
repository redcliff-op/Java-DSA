import java.util.ArrayList;

public class Remove_Min {
  private ArrayList<Integer> heap;

  public Remove_Min() {
    heap = new ArrayList<Integer>();
  }

  boolean isEmpty() {
    return heap.size() == 0;
  }

  int size() {
    return heap.size();
  }

  int getMin() throws PriorityQueueException {
    if (isEmpty()) {
      throw new PriorityQueueException();
    }
    return heap.get(0);
  }

  void insert(int element) {
    heap.add(element);
    int childIndex = heap.size() - 1;
    int parentIndex = (childIndex - 1) / 2;

    while (childIndex > 0) {
      if (heap.get(childIndex) < heap.get(parentIndex)) {
        int temp = heap.get(childIndex);
        heap.set(childIndex, heap.get(parentIndex));
        heap.set(parentIndex, temp);
        childIndex = parentIndex;
        parentIndex = (childIndex - 1) / 2;
      } else {
        return;
      }
    }
  }

  int removeMin() throws PriorityQueueException {
    if (heap.isEmpty()) {
      throw new PriorityQueueException();
    }
    int output = heap.get(0);
    if (heap.size() == 1) {
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
      int minIndex = parentIndex;
      if (leftChildIndex < heap.size() && heap.get(parentIndex) > heap.get(leftChildIndex)) {
        minIndex = leftChildIndex;
      }
      if (rightChildIndex < heap.size() && heap.get(minIndex) > heap.get(rightChildIndex)) {
        minIndex = rightChildIndex;
      }
      if (parentIndex == minIndex) {
        break;
      }
      int temp = heap.get(parentIndex);
      heap.set(parentIndex, heap.get(minIndex));
      heap.set(minIndex, temp);
      parentIndex = minIndex;
    }
    return output;
  }
}

class PriorityQueueException extends Exception {

}
