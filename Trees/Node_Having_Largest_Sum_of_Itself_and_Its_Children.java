public class Node_Having_Largest_Sum_of_Itself_and_Its_Children {
  public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
    int sum = root.data;
    for(int i=0;i<root.children.size();i++){
      sum += root.children.get(i).data;
    }
    TreeNode<Integer> maxNode = root;
    int maxSum = sum;
    for(int i=0;i<root.children.size();i++){
      TreeNode<Integer> result = maxSumNode(root.children.get(i));
      int test = result.data;
      for(int j=0;j<result.children.size();j++){
        test += result.children.get(j).data;
      }
      if(test>maxSum){
        maxSum = test;
        maxNode = result;
      }
    }
    return maxNode;
  }
}
