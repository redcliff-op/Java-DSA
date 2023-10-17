public class Mirror_a_Binary_Tree {
  public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
    if(root==null){
      return;
    }
    BinaryTreeNode<Integer> temp;
    temp = root.right;
    root.right = root.left;
    root.left = temp;
    mirrorBinaryTree(root.left);
    mirrorBinaryTree(root.right);
  }
}
