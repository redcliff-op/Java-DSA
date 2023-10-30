public class Remove_Leaf_Nodes {
  public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
    if(root==null){
      return null;
    }
    if(root.children.isEmpty()){
      return null;
    }
    for(int i=0;i<root.children.size();i++){
      TreeNode<Integer> output = removeLeafNodes(root.children.get(i));
      if(output==null){
        root.children.remove(i);
        i--;
      }
    }
    return root;
  }
}
