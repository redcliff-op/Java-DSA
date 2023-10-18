public class Search_Node_in_BST {
  public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
    if(root==null){
      return false;
    }
    if(root.data==k){
      return true;
    }
    if(root.data<k){
      if(searchInBST(root.right, k)==true){
        return true;
      }
    }else if(root.data>k){
      if(searchInBST(root.left, k)==true){
        return true;
      }
    }
    return false;
  }  
}
