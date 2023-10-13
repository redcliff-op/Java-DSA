public class Print_At_K {
  public static void printK(TreeNode<Integer> root, int k){
    if(k<0){
      return;
    }
    if(k==0){
      System.out.println(root.data);
      return; 
    }
    for(int i=0;i<root.children.size();i++){
      printK(root.children.get(i),k-1);
    }
  }
}
