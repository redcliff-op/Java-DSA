import java.util.Queue;
import java.util.LinkedList;

public class Print_Binary_Tree_LevelWise {
  public static void printLevelWise(BinaryTreeNode<Integer> root) {
    if(root==null){
      System.out.print(-1);
      return;
    }
    Queue<BinaryTreeNode<Integer>> pending = new LinkedList<BinaryTreeNode<Integer>>();
    pending.add(root);
    while(!pending.isEmpty()){
      BinaryTreeNode<Integer> front = pending.poll();
      System.out.print(front.data+":");
      if(front.left!=null){
        System.out.print("L:" + front.left.data + ",");
        pending.add(front.left);
      }else{
        System.out.print("L:" + -1 + ",");
      }
      if(front.right!=null){
        System.out.print("R:" + front.right.data);
        pending.add(front.right);
      }else{
        System.out.print("R:" + -1);
      }
      System.out.println();
    }
  }
}
