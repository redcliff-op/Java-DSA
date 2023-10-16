public class Nodes_Greater_Than_X {
  public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
    int total = 0;
    if(root==null){
      return 0;
    }
    if(root.data>x){
      total++;
    }
    total += countNodesGreaterThanX(root.left, x);
    total += countNodesGreaterThanX(root.right, x);
    return total;
  }
}
