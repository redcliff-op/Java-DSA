import java.util.ArrayList;

public class Path_Sum_Root_To_Leaf {
  public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int K) {
    rootToLeafPathsSumToKHelper(root, K, new ArrayList<>());
  }
  private static void rootToLeafPathsSumToKHelper(BinaryTreeNode<Integer> root, int K, ArrayList<Integer> path) {
    if (root == null) {
      return;
    }
    path.add(root.data);
    if (root.left == null && root.right == null && K == root.data) {
      for (int i = 0; i < path.size() - 1; i++) {
        System.out.print(path.get(i) + " ");
      }
      System.out.println(path.get(path.size() - 1));
    }
    rootToLeafPathsSumToKHelper(root.left, K - root.data, new ArrayList<>(path));
    rootToLeafPathsSumToKHelper(root.right, K - root.data, new ArrayList<>(path));
  }
}
