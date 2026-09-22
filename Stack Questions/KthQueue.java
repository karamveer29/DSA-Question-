// Only following standard operations are allowed on the queue. 

// enqueue(x): Add an item x to rear of queue
// dequeue(): Remove an item from the front of the queue
// size(): Returns the number of elements in the queue.
// front(): Finds front item.
// Example:

// Input: q = 1 2 3 4 5, k = 3
// Output: 3 2 1 4 5
// Explanation:  After reversing the first 3 elements from the given queue the resultant queue will be 3 2 1 4 5.

// Input: q = 4 3 2 1, k= 4
// Output: 1 2 3 4
// Explanation: After reversing the first 4 elements from the given queue the resultant queue will be 1 2 3 4.
import java.util.*;

public class KthQueue {
    static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        moveToEnd(q, k);
        int s = q.size() - k;
        while (s-- > 0) {
            int x = q.poll();
            q.add(x);
        }
        return q;
    }

    static void moveToEnd(Queue<Integer> q, int k) {
        if (k == 0)
            return;
        int e = q.poll();
        moveToEnd(q, k-1);
        q.add(e);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;
        q = reverseFirstK(q, k);
        while (!q.isEmpty()) {
            System.out.println(q.poll() + " ");
        }
    }
}
