public class Append_Last_N_to_First {
  public static int LinkedList_Length(Node<Integer> head){
    Node<Integer> temp = head;
    int count=0;
    while(temp!=null){
      count++;
      temp = temp.next;
    }
    return count;
  }
  public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
    if(n==0 || head == null){
      return head;
    }
		Node<Integer> temp = head;
    int i = 1;
    int l = LinkedList_Length(head);
    while(i<l-n){
      temp = temp.next;
      i++;
    }
    Node<Integer> newHead = temp.next;
    temp.next=null;
    Node<Integer> temp2 = newHead;
    i=1;
    while(i<n){
      temp2 = temp2.next;
      i++; 
    }
    temp2.next = head;
    return newHead;
	}
}
