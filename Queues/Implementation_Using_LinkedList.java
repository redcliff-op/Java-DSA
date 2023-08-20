class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class Implementation_Using_LinkedList {

  private Node front;
  private Node back;
  private int size;
  
  public Implementation_Using_LinkedList(){
    front = null;
    back = null;
    size = 0;
	}
  
  public int getSize() { 
    return size;
  }

  public boolean isEmpty() { 
    return size==0;
  }

  public void enqueue(int data){
    Node temp = new Node(data);
    if(size==0){
      front = temp;
      back = temp;
    }else{
      back.next = temp;
      back = back.next;
    }
    size++;
  }

  public int dequeue() {
    if(size==0){
      return -1;
    }
    int temp = front.data;
    front = front.next;
    size--;
    return temp;
  }

  public int front() {
    if(size==0){
      return -1;
    }
    return front.data;
  }
}