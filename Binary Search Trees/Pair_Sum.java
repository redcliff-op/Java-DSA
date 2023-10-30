import java.util.ArrayList;
import java.util.Collections;

public class Pair_Sum {
  public static void TreeToArrayList(BinaryTreeNode<Integer> root, ArrayList<Integer> arr){
    if(root==null){
      return;
    }
    arr.add(root.data);
    TreeToArrayList(root.left, arr);
    TreeToArrayList(root.right, arr);
  }
  public static void pairSum(BinaryTreeNode<Integer> root, int sum) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    TreeToArrayList(root, arr);
    Collections.sort(arr);
    int i=0,j=arr.size()-1;
    while(i<j){
      int l = arr.get(i);
      int h = arr.get(j);
      if(l+h==sum){
        System.out.println(l+" "+h);
        i++;
      }else if(l+h>sum){
        j--;
      }else if(l+h<sum){
        i++;
      }
    }
  }
}
