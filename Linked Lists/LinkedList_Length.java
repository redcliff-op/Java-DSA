public class LinkedList_Length{
  public static int length(Node head){
    Node temp = head;
    int count=0;
    while(temp!=null){
      count++;
      temp = temp.next;
    }
    return count;
  }
}