import java.util.ArrayList;

public class Merge_K_Sorted_Arrays {
  public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
    if (input == null || input.isEmpty()) {
      return new ArrayList<>();
    }
    return mergeArrays(input, 0, input.size() - 1);
  }

  private static ArrayList<Integer> mergeArrays(ArrayList<ArrayList<Integer>> input, int left, int right) {
    if (left == right) {
      return input.get(left);
    }
    int mid = left + (right - left) / 2;
    ArrayList<Integer> leftArray = mergeArrays(input, left, mid);
    ArrayList<Integer> rightArray = mergeArrays(input, mid + 1, right);
    return merge(leftArray, rightArray);
  }

  private static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
    ArrayList<Integer> result = new ArrayList<>();
    int i = 0, j = 0;
    while (i < left.size() && j < right.size()) {
      if (left.get(i) < right.get(j)) {
        result.add(left.get(i));
        i++;
      } else {
        result.add(right.get(j));
        j++;
      }
    }
    while (i < left.size()) {
      result.add(left.get(i));
      i++;
    }
    while (j < right.size()) {
      result.add(right.get(j));
      j++;
    }
    return result;
  }
}
