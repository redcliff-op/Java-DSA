class LinkedListNode<T>{
  LinkedListNode<T> next;
  T data;
  public LinkedListNode(T data){
    this.data = data;
  }
}

public class Construct_LL_from_BST {
  public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root){
    if(root==null){
      return null;
    }
    LinkedListNode<Integer> middle = new LinkedListNode<Integer>(root.data);
    LinkedListNode<Integer> leftHead = constructLinkedList(root.left);
    LinkedListNode<Integer> rightHead = constructLinkedList(root.right);
    if(leftHead==null){
      middle.next = rightHead;
      return middle;
    }
    LinkedListNode<Integer> temp = leftHead;
    while(temp.next!=null){
      temp = temp.next;
    }
    temp.next = middle;
    middle.next = rightHead;
    return leftHead;
  }  
}
