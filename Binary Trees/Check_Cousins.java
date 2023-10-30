public class Check_Cousins {
  private static int pheight=0;
  private static int qheight=0;
  private static BinaryTreeNode<Integer> pparent;
  private static BinaryTreeNode<Integer> qparent;
  
  public static void helper(BinaryTreeNode<Integer> root, int p, int q, int height,BinaryTreeNode<Integer> parent){
    if(root==null){
      return;
    }
    if(root.data==p){
      pheight = height;
      pparent = parent;
    }
    if(root.data==q){
      qheight = height;
      qparent = parent;
    }
    helper(root.left, p, q, height+1, root);
    helper(root.right, p, q, height+1, root);
  }
  public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
    helper(root, p, q, 0, root);
    return (pheight == qheight) && (pparent!= qparent);
  }
}
