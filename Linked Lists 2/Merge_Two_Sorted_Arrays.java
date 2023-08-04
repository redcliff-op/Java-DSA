public class Merge_Two_Sorted_Arrays {
  public static Node<Integer> mergeTwoSorteds(Node<Integer> t1, Node<Integer> t2) {
    Node<Integer> fin = new Node<Integer>(0);
    Node<Integer> currNode = fin;
    while(t1!=null && t2!=null){
      if(t1.data<t2.data){
        currNode.next = t1;
        t1 = t1.next;
      }else{
        currNode.next = t2;
        t2 = t2.next;
      }
      currNode = currNode.next;
    }
    if(t1!=null){
      currNode.next = t1;
    }else{
      currNode.next = t2;
    }
    return fin.next;
  }  
}
