import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Level_Wise_Input {
  public static BinaryTreeNode<Integer> takeInput(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Data of Root Node : ");
    int rootData = sc.nextInt();
    if(rootData==-1){
      return null;
    }
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
    Queue<BinaryTreeNode<Integer>> pending = new LinkedList<BinaryTreeNode<Integer>>();
    pending.add(root);
    while(!pending.isEmpty()){
      BinaryTreeNode<Integer> front = pending.poll();
      System.out.print("Enter Left Node : ");
      int leftData = sc.nextInt();
      if(leftData!=-1){
        BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(leftData);
        pending.add(left);
        front.left = left;
      }
      System.out.print("Enter Right Node : ");
      int rightData = sc.nextInt();
      if(rightData!=-1){
        BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(rightData);
        pending.add(right);
        front.right = right;
      }
    }
    return root;
  }
}
