class Node {
  int data;
  Node next;
  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class Stack_Implementation_Using_LinkedList{

  Node head;
  int size;

  public Stack_Implementation_Using_LinkedList(){
    head = null;
    size = 0;
  }
  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return size==0;
  }

  public void push(int element) {
    Node temp = new Node(element);
    temp.next = head;
    head = temp;
    size++;
  }

  public int pop(){
    if(size==0){
      return -1;
    }
    int temp = head.data;
    head = head.next;
    size--;
    return temp;
  }

  public int top(){
    if(size==0){
      return -1;
    }
    return head.data;
  }
}
