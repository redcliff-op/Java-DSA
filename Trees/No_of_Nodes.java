public class No_of_Nodes {
  public static Integer noOfNodes(TreeNode<Integer> input){
    // This is Not a Base Case 
    if(input==null){
      return 0;
    }
    int count = 1;
    for(int i=0;i<input.children.size();i++){
      count += noOfNodes(input.children.get(i));
    }
    return count;
  }
}
