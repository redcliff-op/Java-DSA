public class Reverse_LinkedList {
  public static Node<Integer> reverseRec(Node<Integer> head){
    if(head==null || head.next ==null){
      return head;
    }
    Node<Integer> newHead = reverseRec(head.next);
    Node<Integer> headNext = head.next;
    headNext.next = head;
    head.next = null;
    return newHead;
  }
}
