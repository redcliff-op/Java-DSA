public class Sum_Of_Nodes {
  public static int getSum(BinaryTreeNode<Integer> root) {
    if(root==null){
      return 0;
    }
    int sum = root.data;
    sum += getSum(root.left);
    sum += getSum(root.right);
    return sum;
  }  
}
