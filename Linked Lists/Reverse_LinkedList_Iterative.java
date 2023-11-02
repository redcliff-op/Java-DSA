public class Reverse_LinkedList_Iterative {
  public static Node<Integer> reverse_I(Node<Integer> head){
    Node<Integer> curr = head;
    Node<Integer> prev = null;
    while(curr!=null){
      Node<Integer> next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;  
  }
}
