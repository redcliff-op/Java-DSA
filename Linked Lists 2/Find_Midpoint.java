public class Find_Midpoint {
  public static int length(Node<Integer> head){
    Node<Integer> temp = head;
    int count=0;
    while(temp!=null){
      count++;
      temp = temp.next;
    }
    return count;
  }
  public static Node<Integer> midPoint(Node<Integer> head) {
    if(head==null){
      return head;
    }
    int l = length(head);
    if(l==1 || l==2){
      return head;
    }
    Node<Integer> slow = head;
    Node<Integer> fast = head.next;
    while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}
