public class PostOrder_Traversal {
  public static void postOrder(BinaryTreeNode<Integer> root) {
    if(root==null){
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
  }
}
