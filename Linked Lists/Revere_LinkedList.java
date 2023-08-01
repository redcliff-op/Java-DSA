public class Revere_LinkedList {
  public static void printReverse(Node<Integer> root) {
    if(root==null){
      return;
    }
    System.out.println(root.data);
    printReverse(root.next);
	}
}
