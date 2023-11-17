import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Buy_The_Ticket {
  public static int buyTicket(int input[], int k) {
    int n = input.length;
    Queue<Integer> queue = new LinkedList<>();
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
    for (int i = 0; i < n; i++) {
      queue.offer(i);
      priorityQueue.offer(input[i]);
    }
    int time = 0;
    while (!queue.isEmpty()) {
      int frontPerson = queue.poll();
      int frontPriority = priorityQueue.peek();
      if (input[frontPerson] < frontPriority) {
        queue.offer(frontPerson);
      } else {
        time++;
        priorityQueue.poll();
        if (frontPerson == k) {
          return time;
        }
      }
    }
    return -1; 
  }
}
