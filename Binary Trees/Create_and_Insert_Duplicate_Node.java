public class Create_and_Insert_Duplicate_Node {
  public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
    if(root==null){
      return;
    }
    BinaryTreeNode<Integer> temp = root.left;
    BinaryTreeNode<Integer> rootduplicate = new BinaryTreeNode<Integer>(root.data);
    root.left = rootduplicate;
    rootduplicate.left = temp;
    insertDuplicateNode(rootduplicate.left);
    insertDuplicateNode(root.right);
  }
}
