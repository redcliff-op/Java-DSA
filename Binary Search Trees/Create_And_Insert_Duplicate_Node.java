public class Create_And_Insert_Duplicate_Node {
  public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
    if(root==null){
      return;
    }
    BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(root.data);
    temp.left = root.left;
    root.left = temp;
    insertDuplicateNode(temp.left);
    insertDuplicateNode(root.right);
  }
}
