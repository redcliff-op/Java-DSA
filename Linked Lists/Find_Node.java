public class Find_Node {
  public static int findNode(Node<Integer> head, int n) {
    Node<Integer> temp = head;
    int index=-1,i=0;
    while(temp!=null){
      if(temp.data==n){
        index = i;
        break;
      }
      i++;
      temp = temp.next;
    }
    return index;
	}
}
