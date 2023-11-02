public class Merge_Sort {
  public static Node<Integer> midPoint(Node<Integer> head) {
    if(head==null){
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
  public static Node<Integer> sortTwoHalves(Node<Integer> left, Node<Integer> right){
    Node<Integer> result = new Node<Integer>(0);
    Node<Integer> temp = result;
    while(left!=null && right!=null){
      if(left.data<right.data){
        temp.next = left;
        left = left.next;
      }else{
        temp.next = right;
        right = right.next;
      }
      temp = temp.next;
    }
    if(left!=null){
      temp.next = left;
    }
    if(right!=null){
      temp.next = right;
    }
    return result.next;
  }
  public static Node<Integer> mergeSort(Node<Integer> head){
    if(head==null || head.next==null){
      return head;
    }
    Node<Integer> mid = midPoint(head);
    Node<Integer> lhs = head;
    Node<Integer> rhs = mid.next;
    mid.next = null;
    lhs = mergeSort(lhs);
    rhs = mergeSort(rhs);
    return sortTwoHalves(lhs,rhs);
  }
}
