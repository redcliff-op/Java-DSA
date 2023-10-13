public class Find_Height {
  public static int getHeight(TreeNode<Integer> root){
    if(root==null){
      return 0;
    }else{
      int height = 0;
      for(int i=0;i<root.children.size();i++){
        int curHeight = getHeight(root.children.get(i));
        if(curHeight>height){
          height = curHeight;
        }
      }
      return height + 1;
    }
  }
}
