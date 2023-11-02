public class Find_Node {
  public static int findNodeRec(Node<Integer> head, int n,int pos) {
    if(head==null){
      return -1;
    }
    if(head.data.equals(n)){
      return pos;
    }
    return findNodeRec(head.next, n, pos+1);
  }
  public static int findNodeRec(Node<Integer> head, int n) {
    return findNodeRec(head, n, 0);
  }
}
