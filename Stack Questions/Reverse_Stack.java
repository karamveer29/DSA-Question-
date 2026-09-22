// Example: 

// Input: elements present in stack from top to bottom 4 3 2 1
// Output: 1 2 3 4

// Input: elements present in stack from top to bottom 1 2 3
// Output: 3 2 1
import java.util.Stack;

public class Reverse_Stack {
    public static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
        } else {
            int a = s.pop();
            insertAtBottom(s, x);
            s.push(a);
        }
    }

    public static void reverse(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            reverse(s);
            insertAtBottom(s, x);
        }
    }

    public static void main(String[] args) { 
        Stack<Integer> s = new Stack<>();
        // pushing the element from bottom to top
        s.push(50);
        s.push(40);
        s.push(30);
        s.push(20);
        s.push(10);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
