import java.util.ArrayList;

public class Find_Path_in_BST {
  public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
    if(root==null){
      return null;
    }
    if(root.data==data){
      ArrayList<Integer> output = new ArrayList<Integer>();
      output.add(root.data);
      return output;
    }
    ArrayList<Integer> leftside = getPath(root.left, data);
    if(leftside!=null){
      leftside.add(root.data);
      return leftside;
    }
    ArrayList<Integer> rightside = getPath(root.right, data);
    if(rightside!=null){
      rightside.add(root.data);
      return rightside;
    }else{
      return null;
    }
  }  
}
