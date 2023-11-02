public class Even_After_Odd {
  public static Node<Integer> evenAfterOdd(Node<Integer> head) {
    if(head==null || head.next==null){
      return head;
    }
		Node<Integer> temp=head,OddHead=null,OddTail=null,EvenHead=null,EvenTail=null;
    while(temp!=null){
      if(temp.data%2!=0){
        if(OddHead==null){
          OddHead = temp;
          OddTail = temp;
        }else{
          OddTail.next = temp;
          OddTail = OddTail.next;
        }
      }else{
        if(EvenHead==null){
          EvenHead=temp;
          EvenTail = temp;
        }else{
          EvenTail.next = temp;
          EvenTail = EvenTail.next;
        }
      }
      temp = temp.next;
    }
    if(OddHead==null){
      return EvenHead;
    }
    OddTail.next = EvenHead;
    if(EvenHead!=null){
      EvenTail.next = null;
    }
    return OddHead;
	}
}
