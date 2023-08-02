public class Remove_Duplicates {
  public static Node<Integer> removeDuplicates(Node<Integer> head) {
    if(head==null){
      return head;
    }
    if(head.data==head.next.data){
      head = head.next;
    }
    Node<Integer> temp = head;
    while(temp.next!=null){
      if(temp.data.equals(temp.next.data)){
        temp.next = temp.next.next;
      }
      else{
        temp = temp.next;
      }
    }
    return head;
	}
}
