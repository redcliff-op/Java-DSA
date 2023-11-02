public class kReverse {
  public static Node<Integer> reverse(Node<Integer> head){
    Node<Integer> pre=null,curr=head;
    while(curr!=null){
      Node<Integer> temp= curr.next;
      curr.next=pre;
      pre=curr;
      curr=temp;
    }
    return pre;
	}
  public static int len(Node<Integer> head){
    int l=0;
    while(head!=null){
      l++;
      head=head.next;
    }
    return l;
  }
  public static Node<Integer> kReverse(Node<Integer> head, int k) {
    if(k >= len(head)){
      return reverse(head);
    }
    Node<Integer> tempHead= head;
    for(int i=1;i<k;i++){
      head=head.next;
    }
    Node<Integer> temp=head.next;
    head.next=null;
    Node<Integer> reversedHead= reverse(tempHead);
    Node<Integer> tail= tempHead;
    Node<Integer> smallAns= kReverse(temp,k);
    tail.next= smallAns;
    return reversedHead;
  }
}
