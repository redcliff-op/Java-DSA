import java.util.Queue;

public class Reverse_Queue {
  public static void reverseQueue(Queue<Integer> input) {
    if(input.isEmpty()){
      return;
    }
    int temp = input.remove();
    reverseQueue(input);
    input.add(temp);
  }
}
