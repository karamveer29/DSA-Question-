import java.util.LinkedList;
import java.util.Queue;
public class eStackUsingQueue {
    Queue<Integer> q = new LinkedList<>();
    void push(int x){
        q.add(x);
        for(int i=0; i< q.size()-1; i++)
            q.add(q.remove());
    }
    int pop(){
        if(q.isEmpty()){
            return - 1;
        }else{
            return q.remove();
        }
    }
    public static void main(String[] args) {
        eStackUsingQueue s = new eStackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
