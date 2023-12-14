import java.util.*;

public class Main_Priority_Queues {
    public static void main(String[] args) {
        
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
            
        }
    }
}
