public class Is_Node_Present {
  public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
    if(root==null){
      return false;
    }
    if(root.data==x){
      return true;
    }
    if((isNodePresent(root.left, x)||isNodePresent(root.right, x))==true){
      return true;
    }
    return false;
  }
}
