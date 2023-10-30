import java.util.ArrayList;

public class Path_To_Sum_Leaf {
  public static void rootToLeafPathsSumToKHelper(BinaryTreeNode<Integer> root, int k,ArrayList<Integer> path) {
    if(root==null){
      return;
    }
    path.add(root.data);
    if(root.right==null&&root.left==null){
      int sum = 0;
      for(int e:path){
        sum+=e;
      }
      if(sum==k){
        for(int e:path){
          System.out.print(e + " ");
        }
        System.out.println();
      }
    }else{
        rootToLeafPathsSumToKHelper(root.left, k, path);
        rootToLeafPathsSumToKHelper(root.right, k,path);
    }
    path.remove(path.size()-1);
  }
  public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
    rootToLeafPathsSumToKHelper(root, k, new ArrayList<Integer>());
  }
}
