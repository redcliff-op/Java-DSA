import java.util.Queue;
import java.util.LinkedList;

public class Level_Order_Transversal {
  public static void printLevelWise(BinaryTreeNode<Integer> root) {
    if(root==null){
      return;
    }
    Queue<BinaryTreeNode<Integer>> leftover = new LinkedList<BinaryTreeNode<Integer>>();
    leftover.add(root);
    leftover.add(null);
    while(!leftover.isEmpty()){
      BinaryTreeNode<Integer> front = leftover.poll();
      if(front!=null){
        System.out.print(front.data + " ");
        if(front.left!=null){
          leftover.add(front.left);
        }
        if(front.right!=null){
          leftover.add(front.right);
        }
      }else{
        if(leftover.isEmpty()){
          break;
        }else{
          System.out.println();
          leftover.add(null);
        }
      }
    }
  }
}
