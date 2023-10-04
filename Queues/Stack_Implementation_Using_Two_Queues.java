import java.util.LinkedList;
import java.util.Queue;

public class Stack_Implementation_Using_Two_Queues {
  private Queue<Integer> q1;
  private Queue<Integer> q2;
  int size;
  public Stack_Implementation_Using_Two_Queues(){
    q1 = new LinkedList<Integer>();
    q2 = new LinkedList<Integer>();
    size = 0;
  }
  public int getSize(){
    return size;
  }
  public boolean isEmpty(){
    return size==0;
  }
  public void push(int x){
    q1.add(x);
    size++;
  }
  public int pop(){
    if(size==0){
      return -1;
    }
    if(size==1){
      size--;
      return q1.remove();
    }
    for(int i=0;i<size-1;i++){
      q2.add(q1.remove());
    }
    int temp = q1.remove();
    for(int i=0;i<size-1;i++){
      q1.add(q2.remove());
    }
    size--;
    return temp;
  }
  public int top(){
    if(size==0){
      return -1;
    }
    if(size==1){
      return q1.peek();
    }
    for(int i=0;i<size-1;i++){
      q2.add(q1.remove());
    }
    int temp = q1.peek();
    q2.add(q1.remove());
    Queue<Integer> q = q2;
    q1 = q2;
    q2 = q;
    return temp;
  }
}
