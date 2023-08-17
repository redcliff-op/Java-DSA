public class Bubble_Sort {

  public static int length(Node<Integer> head) {
    int l = 0;
    while (head != null) {
      l++;
      head = head.next;
    }
    return l;
  }

  public static Node<Integer> bubbleSort(Node<Integer> head) {
    Node<Integer> orginalHead = head;
    int n = length(head);
    for (int i = 0; i < n - 1; i++) {
      Node<Integer> prev = null, curr = orginalHead;
      for (int j = 0; j < n - i - 1; j++) {
        if (curr.data <= curr.next.data) {
          prev = curr;
          curr = curr.next;
        } else {
          if (prev == null) {
            Node<Integer> curr2 = curr.next;
            Node<Integer> temp = curr2.next;
            curr2.next = curr;
            curr.next = temp;
            prev = curr2;
            orginalHead = curr2;
          } else {
            Node<Integer> curr2 = curr.next;
            Node<Integer> temp = curr2.next;
            prev.next = curr2;
            curr2.next = curr;
            curr.next = temp;
            prev = curr2;
          }
        }
      }
    }
    return orginalHead;
  }
}
