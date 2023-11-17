public class Check_Max_Heap {
  public static boolean checkMaxHeap(int arr[]) {
    int n = arr.length;
    for (int i = (n / 2) - 1; i >= 0; i--) {
      if (!isMaxHeapNode(arr, i, n)) {
        return false;
      }
    }
    return true;
  }
  private static boolean isMaxHeapNode(int arr[], int i, int n) {
    int leftChild = 2 * i + 1;
    int rightChild = 2 * i + 2;
    if (leftChild < n && arr[leftChild] > arr[i]) {
      return false;
    }
    if (rightChild < n && arr[rightChild] > arr[i]) {
      return false;
    }
    return true;
  }
}
