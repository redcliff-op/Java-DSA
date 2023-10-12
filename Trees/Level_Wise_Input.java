import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Level_Wise_Input {
  public static TreeNode<Integer> takeInput(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the data of root Node : ");
    TreeNode<Integer> root = new TreeNode<Integer>(sc.nextInt());
    Queue<TreeNode<Integer>> total = new LinkedList<TreeNode<Integer>>();
    total.add(root);
    while(!total.isEmpty()){
      TreeNode<Integer> front = total.remove();
      System.out.printf("Enter the number of elements of %d : \n",front.data);
      int n = sc.nextInt();
      for(int i=0;i<n;i++){
        System.out.printf("Enter the %dth Data of %d Node : \n",i+1,front.data);
        TreeNode<Integer> child = new TreeNode<Integer>(sc.nextInt());
        front.children.add(child);
        total.add(child);
      }
    }
    sc.close();
    return root;
  }

  public static void printTree(TreeNode<Integer> temp){
    String s = temp.data + ":";
    for(int i=0;i<temp.children.size();i++){
      s = s + temp.children.get(i).data + ',';
    }
    System.out.println(s);
    for(int i=0;i<temp.children.size();i++){
      printTree(temp.children.get(i));
    }
  }

  public static void main(String[] args) {
    TreeNode<Integer> temp = takeInput();
    printTree(temp);
  }
}
