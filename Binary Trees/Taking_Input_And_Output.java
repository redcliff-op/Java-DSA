import java.util.Scanner;

class BinaryTreeNode<T>{
  public T data;
  public BinaryTreeNode<T> left;
  public BinaryTreeNode<T> right;
  public BinaryTreeNode(T data){
    this.data = data;
  }
}

public class Taking_Input_And_Output{

  public static BinaryTreeNode<Integer> takeInput(Scanner sc){
    System.out.print("Enter the Data of Node : ");
    int data = sc.nextInt();
    if(data==-1){
      return null;
    }
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
    root.left = takeInput(sc);
    root.right = takeInput(sc);
    return root;
  }

  public static void printTree(BinaryTreeNode<Integer> root){
    if(root==null){
      return;
    }
    String s = root.data + " ";
    if(root.left!=null){
      s += "L:" + root.left.data + ", ";
    }
    if(root.right!=null){
      s += "R:" + root.right.data + ", ";
    }
    System.out.println(s);
    printTree(root.left);
    printTree(root.right);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BinaryTreeNode<Integer> test = takeInput(sc);
    printTree(test); 
  }
}
