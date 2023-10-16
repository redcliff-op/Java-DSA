public class Height_Of_Binary_Tree {
  public static int height(BinaryTreeNode<Integer> root) {
    if(root==null){
      return 0;
    }
    int height = 0;
    int lheight = height(root.left);
    int rheight = height(root.right);
    height = Math.max(lheight, rheight);
    return height + 1;
  }
}
