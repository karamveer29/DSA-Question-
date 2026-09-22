import java.util.Stack;
public class dQueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void enqueue(int x){
        s1.push(x);
    }
    int dequeue(){
        if(s2.isEmpty()){
            while(!s1.isEmpty())
                s2.push(s1.pop());
        }
        if(s2.isEmpty()){
            return -1;
        }else{
            return s2.pop();
        }
    }
    
    public static void main(String[] args) {
        dQueueUsingStack q = new dQueueUsingStack();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
