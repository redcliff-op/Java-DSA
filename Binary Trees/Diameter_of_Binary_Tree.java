class Pair<T>{
  T height;
  T diameter;
  public Pair(T height, T diameter){
    this.height = height;
    this.diameter = diameter;
  }
}

public class Diameter_of_Binary_Tree{
  public static Pair<Integer> helper(BinaryTreeNode<Integer> root){
    if(root==null){
      Pair<Integer> output = new Pair<Integer>(0, 0);
      return output;
    }
    Pair<Integer> l = helper(root.left);
    Pair<Integer> r = helper(root.right);
    int height = 1 + Math.max(l.height, r.height);
    int option1 = 1+ l.height + r.height;
    int option2 = l.diameter;
    int option3 = r.diameter;
    int diameter = Math.max(option1, Math.max(option2, option3));
    Pair<Integer> output = new Pair<Integer>(height,diameter);
    return output;
  }
  public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
    Pair<Integer> output = helper(root);
    return output.diameter;
  }
}