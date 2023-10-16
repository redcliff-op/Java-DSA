public class Nodes_Without_Siblings {
  public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
    if(root==null){
      return;
    }
    if(root.left==null && root.right!=null){
      System.out.print(root.right.data + " ");
    }else if(root.right==null && root.left!=null){
      System.out.print(root.left.data);
    }
    printNodesWithoutSibling(root.left);
    printNodesWithoutSibling(root.right);
  }
}
