public class Replace_With_Sum_of_Larger_Nodes {
  private static int sum = 0;
  public static BinaryTreeNode<Integer> replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
    if (root == null) {
      return null;
    }
    root.right = replaceWithLargerNodesSum(root.right);
    int originalData = root.data;
    root.data = originalData + sum;
    sum += originalData;
    root.left = replaceWithLargerNodesSum(root.left);
    return root;
  }
}
