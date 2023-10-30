import java.util.Queue;
import java.util.LinkedList;

public class BST_Class {
  BinaryTreeNode<Integer> root;
  public BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root,int data){
    if(root==null){
      BinaryTreeNode<Integer> output = new BinaryTreeNode<Integer>(data);
      return output;
    }
    if(data>root.data){
      root.right = insertHelper(root.right, data);
    }else if(data<=root.data){
      root.left = insertHelper(root.left, data);
    }
    return root;
  }
  public void insert(int data) {
    root = insertHelper(root, data);
  } 
  public BinaryTreeNode<Integer> removeHelper(BinaryTreeNode<Integer> root, int data){
    if(root==null){
      return null;
    }
    if(root.data<data){
        root.left = removeHelper(root.right, data);
        return root;
    }else if(root.data>data){
      root.right = removeHelper(root.left, data);
      return root;
    }else{
      if(root.left==null && root.right==null){
        return null;
      }
      else if(root.left!=null&&root.right==null){
        return root.left;
      }
      else if(root.left==null&&root.right!=null){
        return root.right;
      }
      else{
        BinaryTreeNode<Integer> minNode = root.right;
        while(minNode.left!=null){
          minNode = minNode.left;
        }
        root.data = minNode.data;
        root.right = removeHelper(root.right, minNode.data);
        return root;
      }
    }
  }
	public void remove(int data) {
    root = removeHelper(root, data);
  }
	public static void printTreeHelper(BinaryTreeNode<Integer> root) {
    if(root==null){
      return;
    }
    Queue<BinaryTreeNode<Integer>> pending = new LinkedList<BinaryTreeNode<Integer>>();
    pending.add(root);
    while(!pending.isEmpty()){
      BinaryTreeNode<Integer> front = pending.poll();
      System.out.print(front.data+":");
      if(front.left!=null){
        System.out.print("L:" + front.left.data + ",");
        pending.add(front.left);
      }
      if(front.right!=null){
        System.out.print("R:" + front.right.data);
        pending.add(front.right);
      }
      System.out.println();
    }
  }
	public void printTree() {
    printTreeHelper(root);
  }
	public static boolean searchHelper(BinaryTreeNode<Integer> root, int k) {
    if(root==null){
      return false;
    }
    if(root.data==k){
      return true;
    }
    if(root.data<k){
      return searchHelper(root.right, k);
    }else if(root.data>k){
      return searchHelper(root.left,k);
    }
    return false;
  }  
	public boolean search(int data) {
    return searchHelper(root, data);
	}   
}
