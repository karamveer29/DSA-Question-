// Delete middle Element of a Stack
// Input: s = [10, 20, 30, 40, 50]
// Output: [50, 40, 20, 10]
import java.util.Stack;
public class pDeleteMiddle {
    static void deleteMidUtil(Stack<Integer> st, int sizeOfStack, int current) {
        if (current == sizeOfStack / 2) {
            st.pop();
            return;
        }

        int x = st.pop();
        current += 1;

        deleteMidUtil(st, sizeOfStack, current);
        st.push(x);
    }

    static void deleteMid(Stack<Integer> st, int sizeOfStack) {
        deleteMidUtil(st, sizeOfStack, 0);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        deleteMid(st, st.size());

        while (!st.isEmpty()) {
            int p = st.pop();
            System.out.print(p + " ");
        }
    }
}
