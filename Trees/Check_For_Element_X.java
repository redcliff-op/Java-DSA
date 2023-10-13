public class Check_For_Element_X {
  public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
    if(root==null){
      return false;
    }
    if(root.data.equals(x)){
      return true;
    }
    for(int i=0;i<root.children.size();i++){
      if(checkIfContainsX(root.children.get(i), x)==true){
        return true;
      }
    }
    return false;
  }
}
