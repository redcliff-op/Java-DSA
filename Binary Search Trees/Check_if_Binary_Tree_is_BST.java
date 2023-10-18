public class Check_if_Binary_Tree_is_BST {
  public static boolean isBST(BinaryTreeNode<Integer> root, int low, int high) {
    if(root==null){
      return true;
    }
    if(root.data>high || root.data<low){
      return false;
    }
    return isBST(root.left,low,root.data) && isBST(root.right,root.data,high);
  } 
  public static boolean isBST(BinaryTreeNode<Integer> root) {
    return isBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
  }  
}
