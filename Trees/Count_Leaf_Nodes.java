public class Count_Leaf_Nodes {
  public static int countLeafNodes(TreeNode<Integer> root){
    int count = 0;
    if(root.children.isEmpty()){
      return 1;
    }
    for(int i=0;i<root.children.size();i++){
      count += countLeafNodes(root.children.get(i));
    }
    return count;
  }
}
