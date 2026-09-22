// Using Two Queue - Push in O(1) and Pop() in O(n)
import java.util.*;
import java.util.LinkedList;

public class gMyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int x){
        q1.add(x);
    }
    void pop(){
        if(q1.isEmpty()) return;
        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.remove();
        }
        q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    int top(){
        if(q1.isEmpty())
            return -1;
        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.remove();
        }
        int temp = q1.peek();
        q1.remove();
        q2.add(temp);
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
        return temp;
    }
    int size(){
        return q1.size();
    }
    public static void main(String[] args) {
        gMyStack st = new gMyStack();
        st.push(10);
        st.push(11);
        st.push(12);
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.pop();
    }
}
