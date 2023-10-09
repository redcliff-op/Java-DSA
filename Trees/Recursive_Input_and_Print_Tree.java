import java.util.ArrayList;
import java.util.Scanner;

class TreeNode<T>{
  public T data;
  public ArrayList<TreeNode<T>> children;
  public TreeNode(T data){
    this.data = data;
    children = new ArrayList<>();
  }
}

public class Recursive_Input_and_Print_Tree{

  public static TreeNode<Integer> takeInput(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the data of Root Node : ");
    TreeNode<Integer> root = new TreeNode<Integer>(sc.nextInt());
    System.out.print("Enter the Number of Sub Nodes : ");
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      TreeNode<Integer> child = takeInput();
      root.children.add(child);
    }
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