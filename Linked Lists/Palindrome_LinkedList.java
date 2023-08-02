public class Palindrome_LinkedList {
  public static int length(Node<Integer> head){
    Node<Integer> temp = head;
    int count=0;
    while(temp!=null){
      count++;
      temp = temp.next;
    }
    return count;
  }
  public static boolean isPalindrome(Node<Integer> head) {
    Node<Integer> temp = head;
    int l = length(head);
    int arr[] = new int[l];
    for(int i=l-1;i>=0;i--){
      arr[i] = temp.data;
      temp = temp.next;
    }
    temp = head;
    for(int i=0;i<arr.length;i++){
      if(!(arr[i]==(temp.data))){
        return false;
      }
      temp = temp.next;
    }
    return true;
  }
}
