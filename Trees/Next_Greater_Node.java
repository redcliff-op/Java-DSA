public class Next_Greater_Node {
  public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
    TreeNode<Integer> result = null;
    if(root.data>n){
      result = root;
    }
    for(int i=0;i<root.children.size();i++){
      TreeNode<Integer> temp = findNextLargerNode(root.children.get(i), n);
      if(temp!=null){
        if(result ==null || temp.data < result.data){
          result = temp;
        }
      }
    }
    return result;
  }
}
