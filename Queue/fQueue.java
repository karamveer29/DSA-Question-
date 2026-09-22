// Normal Queue Vs Priority Queue
import java.util.LinkedList;
import java.util.*;

public class fQueue {
    public static void main(String[] args) {
        // Normal Queue
        Queue<Integer> Normal = new LinkedList<>();
        Normal.add(34);
        Normal.add(14);
        Normal.add(54);
        Normal.add(84);
        System.out.println("Normal Queue: ");
        while (!Normal.isEmpty()) {
            System.out.print(Normal.poll() + " ");

        System.out.println();    
        }

        // Priority Queue 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(30);
        pq.add(20);
        pq.add(10);

        System.out.println("Priority Queue:" );
        while (!pq.isEmpty()) {
            System.out.println(pq.poll() + " ");
        }
    }
}
