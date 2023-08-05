public class Delete_Every_N_Nodes {
  public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N){
    Node<Integer> temp1 = head;
    if(head == null || head.next == null){
      return head;
    }
    if(M==0){
      temp1 = null;
      return temp1;
    }
    int trigger = 1;
    while(temp1!=null){
      if(trigger==M){
        for(int i=0;i<N;i++){
          if(temp1.next!=null){
            temp1.next = temp1.next.next;
          }
        }
        trigger = 1;
      }else{
        trigger++;
      }
      temp1 = temp1.next;
    }
    return head;
	} 
}