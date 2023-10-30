import java.util.ArrayList;
import java.util.Collections;

public class Longest_Leaf_To_Root_Path {
  private static int pathlength = 0;
  public static ArrayList<Integer> helper(BinaryTreeNode<Integer> root, ArrayList<Integer> path,ArrayList<Integer> fin){
    if(root==null){
      return null;
    }
    path.add(root.data);
    if(root.left==null&&root.right==null){
      if(path.size()>pathlength){
        pathlength = path.size();
        fin.clear();
        fin.addAll(path);
      }
    }else{
      helper(root.left, path,fin);
      helper(root.right, path,fin);
    }
    path.remove(path.size()-1);
    return fin;
  }
  public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
    ArrayList<Integer> output = helper(root, new ArrayList<Integer>(), new ArrayList<Integer>());
    Collections.reverse(output);
    return output;
  }
}
