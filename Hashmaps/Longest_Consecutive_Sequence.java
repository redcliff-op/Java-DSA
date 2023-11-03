import java.util.ArrayList;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {
  public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
    HashSet<Integer> numSet = new HashSet<>();
    int maxLength = 0;
    int start = 0;
    for (int num : arr) {
      numSet.add(num);
    }
    for (int num : arr) {
      if (!numSet.contains(num - 1)) {
        int currentNum = num;
        int len = 0;
        while (numSet.contains(currentNum)) {
          currentNum++;
          len++;
        }
        if (len > maxLength) {
          maxLength = len;
          start = num;
        }
      }
    }
    ArrayList<Integer> output = new ArrayList<>();
    output.add(start);
    output.add(start + maxLength - 1);
    return output;
  }
}
