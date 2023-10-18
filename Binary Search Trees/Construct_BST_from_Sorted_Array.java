public class Construct_BST_from_Sorted_Array {
  public static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int start, int end){
    if(start>end){
      return null;
    }
    int mid = (start+end)/2;
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
    root.left = SortedArrayToBSTHelper(arr,start,mid-1);
    root.right = SortedArrayToBSTHelper(arr,mid+1,end);
    return root;
  }
  public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
    return SortedArrayToBSTHelper(arr, 0, n-1);
  }  
}
