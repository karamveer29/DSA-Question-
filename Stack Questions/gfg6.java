// Queue using Stacks
import java.util.*;
public class gfg6 {
    static class Queue {
    
        
        // Stack<Integer> s1 = new Stack<>();
        // Stack<Integer> s2 = new Stack<>();
        
        // void enqueue(int x){
        //     s1.push(x);
        // }
        // int dequeue(){
        //     if(s1.empty() && s2.empty()){
        //         return -1;
        //     }
        //     if(s2.empty()){
        //         while (!s1.empty()) {
        //             s2.push(s1.peek());
        //             s1.pop();
        //         }
        //     }
        //     int x = s2.peek();
        //     s2.pop();
        //     return x;
        // }
        Stack<Integer> s = new Stack<>();
        void enqueue(int x){
            s.push(x);
        }
        int dequeue(){
            if(s.empty()){
                return -1;
            }
            int x = s.peek();
            s.pop();
            if(s.empty())
                return x;
            int item = dequeue();
            s.push(x);
            return item;    
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
