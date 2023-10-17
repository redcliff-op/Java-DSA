public class Construct_Tree_from_PostOrder_and_Inorder {
  public static BinaryTreeNode<Integer> helper(int[] postOrder, int[] inOrder, int pstart, int pend,int istart, int iend){
    if(pstart>pend || istart > iend){
      return null;
    }
    int rootData = postOrder[pend];
    int rootIndex = 0;
    while(inOrder[rootIndex]!=rootData){
      rootIndex++;
    }
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
    int leftSubTreeSize = rootIndex - istart;
    root.left = helper(postOrder, inOrder, pstart, pstart + leftSubTreeSize -1, istart, rootIndex-1);
    root.right = helper(postOrder, inOrder,pstart + leftSubTreeSize, pend -1, rootIndex + 1, iend);
    return root;
  }
  public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
    return helper(postOrder, inOrder, 0, postOrder.length-1, 0, inOrder.length-1);
  }
}
