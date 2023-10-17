import java.util.ArrayList;

public class Print_Nodes_at_Distance_K_from_Node {
  public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int target, int K) {
    ArrayList<Integer> result = new ArrayList<>();
    findNodesAtDistanceK(root, target, K, result);
    for (int value : result) {
      System.out.println(value);
    }
  }
  private static int findNodesAtDistanceK(BinaryTreeNode<Integer> root, int target, int K, ArrayList<Integer> result){
    if (root==null){
      return -1;
    }
    if (root.data==target){
      addNodesAtDistanceK(root,K,result);
      return 0;
    }
    int leftDistance = findNodesAtDistanceK(root.left,target,K,result);
    if (leftDistance>=0){
      if (leftDistance+1==K){
        result.add(root.data);
      }else{
        addNodesAtDistanceK(root.right,K-leftDistance-2,result);
      }
      return leftDistance+1;
    }
    int rightDistance=findNodesAtDistanceK(root.right, target, K, result);
    if (rightDistance>=0) {
      if (rightDistance+1==K){
        result.add(root.data);
      }else{
        addNodesAtDistanceK(root.left,K-rightDistance-2,result);
      }
      return rightDistance + 1;
    }
    return -1;
  }
  private static void addNodesAtDistanceK(BinaryTreeNode<Integer> root, int K, ArrayList<Integer> result){
    if(root==null){
      return;
    }
    if(K==0){
      result.add(root.data);
    }else{
      addNodesAtDistanceK(root.left, K - 1, result);
      addNodesAtDistanceK(root.right, K - 1, result);
    }
  }
}
