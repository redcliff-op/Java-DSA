class Node<T>{
  T data;
  Node<T> next;
  Node(T data){
    this.data = data;
  }
}

public class Print_Ith_node {
  public static void printIthNode(Node<Integer> head, int i){
    int index=0;
    while(head!=null){
      if(index==i){
        System.out.println(head.data);
      }
      head = head.next;
      index++;
    }
  }  
}
