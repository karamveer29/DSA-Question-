import java.util.LinkedList;
import java.util.Queue;

public class hReverseQueue {
    static void printQueue(Queue<Integer> q){
        while(!q.isEmpty()){
            System.out.println(q.poll() + " ");
        }
    }
    static void reverseQueue(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int data = q.poll();
        reverseQueue(q);
        q.add(data);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        reverseQueue(q);
        printQueue(q);
    }
}
