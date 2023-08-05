public class Delete_Node_Recursively {
  public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
    if(pos==0){
      return head.next;
    }
    if(head.next==null){
      return head;
    }
    head.next = deleteNodeRec(head.next, pos-1);
    return head;
  }
}
