class CustomBST<T>{
  public T max;
  public T min;
  public boolean isBST;
  public T height;
  public CustomBST(T min, T max, boolean isBST, T height){
    this.min = min;
    this.max = max;
    this.isBST = isBST;
    this.height = height;
  }
}

public class Largest_BST {
  public static CustomBST<Integer> helper(BinaryTreeNode<Integer> root){
    if(root==null){
      boolean bst = true;
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      int height = 0;
      CustomBST<Integer> output = new CustomBST<Integer>(min,max,bst,height);
      return output;
    }
    int min = root.data;
    int max = root.data;
    int height = 0;
    CustomBST<Integer> left = helper(root.left);
    CustomBST<Integer> right = helper(root.right);
    if(left.isBST && right.isBST && (left.max<root.data && right.min>root.data)){
      min = Math.min(min, Math.min(left.min, right.min));
      max = Math.max(max,Math.max(left.max, right.max));
      height = 1 + Math.max(left.height, right.height);
      return new CustomBST<Integer>(min, max, true, height);
    }else{
      return new CustomBST<Integer>(min, max, false, Math.max(left.height,right.height));
    }
    
  } 
  public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
    CustomBST<Integer> output = helper(root);
    return output.height;
  }
}
