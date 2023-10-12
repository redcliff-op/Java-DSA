public class No_of_Nodes_Greater_than_X {
  public static int numNodeGreater(TreeNode<Integer> root,int x){
    int count = 0;
    if(root.data>x){
      count++;
    }
    for(int i=0;i<root.children.size();i++){
      count += numNodeGreater(root.children.get(i), x);
    }
    return count;
  }
}
