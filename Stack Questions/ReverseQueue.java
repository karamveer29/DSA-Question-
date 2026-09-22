// Step-1: enqueue(x): Add an item x to the rear of the queue.
// step-2: dequeue(): Remove an item from the front of the queue.
// step-3: empty(): Check if the queue is empty or not.
// Examples: 

// Input: q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
// Output: q = [100, 90, 80, 70, 60, 50, 40, 30, 20, 10]

// Input: q = [1, 2, 3, 4, 5]
// Output: q = [5, 4, 3, 2, 1]
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseQueue {
    public static void print(Queue<Integer> q){
        while(!q.isEmpty()){
            System.out.println(q.poll()+" ");
        }
    }
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.poll());
        }while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        reverseQueue(q);
        print(q);
    }
}
