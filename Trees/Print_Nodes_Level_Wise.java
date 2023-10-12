import java.util.Queue;
import java.util.LinkedList;

public class Print_Nodes_Level_Wise {
  public static void printLevelWise(TreeNode<Integer> input){
    Queue<TreeNode<Integer>> temp = new LinkedList<TreeNode<Integer>>();
    temp.add(input);
    temp.add(null);
    while(!temp.isEmpty()){
      TreeNode<Integer> front = temp.poll();
      if(front!=null){
        System.out.print(front.data + " ");
        for(int i=0;i<front.children.size();i++){
          temp.add(front.children.get(i));
        }
      }else{
        System.out.println();
        if(!temp.isEmpty()){
          temp.add(null);
        }
      }
    }
  }
}
