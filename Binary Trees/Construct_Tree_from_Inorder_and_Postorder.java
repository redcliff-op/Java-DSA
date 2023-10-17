public class Construct_Tree_from_Inorder_and_Postorder {
  public static BinaryTreeNode<Integer> helper(int[] preOrder, int[] inOrder,int pstart, int pstop, int istart, int istop){
    if(pstart>pstop || istart > istop){
      return null;
    }
    int rootData = preOrder[pstart];
    int rootIndex = 0;
    while(inOrder[rootIndex]!=rootData){
      rootIndex++;
    }
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
    int leftSubtreeSize = rootIndex - istart;
    root.left = helper(preOrder, inOrder, pstart +1 , pstart + leftSubtreeSize, istart, rootIndex-1);
    root.right = helper(preOrder, inOrder, pstart + leftSubtreeSize + 1, pstop, istart = rootIndex+1, istop);
    return root;
  }
  public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
    return helper(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
  }
}
