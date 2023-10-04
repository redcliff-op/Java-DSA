import java.util.Queue;

public class Reverse_First_K_Elements {
  public static void reverseQueue(Queue<Integer> input, int k, int x) {
    if(x==k){
      return;
    }
    int temp = input.remove();
    reverseQueue(input,k,x+1);
    input.add(temp);
  }
  public static Queue<Integer> reverseKElements(Queue<Integer> input, int k){
    reverseQueue(input, k,0);
    for(int i=0;i<input.size()-k;i++){
      input.add(input.remove());
    }
    return input;
  }
}
