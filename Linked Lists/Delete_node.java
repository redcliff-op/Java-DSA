public class Delete_node {

  // List Length func will be used in next question aswell
  public static int ListLength(Node<Integer> head){
    Node<Integer> temp = head;
    int count=0;
    while(temp!=null){
      count++;
      temp = temp.next;
    }
    return count;
  }

  public static Node<Integer> deleteNode(Node<Integer> head, int pos){
    Node<Integer> temp = head;
    int i=0;
    if(temp==null || pos>ListLength(temp)){
      return head;
    }
    if(pos==0){
      return head.next;
    }
    while(i<pos-1){
      i++;
      temp = temp.next;
    }
    if(temp.next==null){
      temp = null;
    }else{
      temp.next = temp.next.next;
    }
    return head;
	}  
}
