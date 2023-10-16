public class Replace_Node_With_Depth {
  public static void replaceWithDepthValueHelper(TreeNode<Integer> root, int depth){
    root.data = depth;
    for(int i=0;i<root.children.size();i++){
      replaceWithDepthValueHelper(root.children.get(i),++depth);
    }
  }
  public static void replaceWithDepthValue(TreeNode<Integer> root){
    replaceWithDepthValueHelper(root,0);
  }
}
