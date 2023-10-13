public class Pre_Order_Traversal {
  public static void PreOrderTraversal(TreeNode<Integer> input){
    if(input==null){
      return;
    }
    System.out.print(input.data + " ");
    for(int i=0;i<input.children.size();i++){
      PreOrderTraversal(input.children.get(i));
    }
  }
}
