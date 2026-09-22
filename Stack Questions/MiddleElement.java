// Delete Middle Element of the Stack
// Input: s = [10, 20, 30, 40, 50]
// Output: [50, 40, 20, 10]
// Explanation: The bottom-most element will be 10 and the top-most 
// element will be 50. Middle element will be element at index 3 from 
// bottom, which is 30. Deleting 30, stack will look like [10, 20, 40, 50].

// Input: s = [5, 8, 6, 7, 6, 6, 5, 10, 12, 9]
// Output: [9, 12, 10, 5, 6, 7, 6, 8, 5]
import java.util.Stack;
public class MiddleElement {
    public static void deleteMid(Stack<Integer> st){
        int n = st.size();
        Stack<Integer> tempSt = new Stack<>();
        int count = 0;
        while (count < n / 2) {
            int c = st.pop();
            tempSt.push(c);
            count++;
        }
        st.pop();
        while(!tempSt.isEmpty()){
            st.push(tempSt.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        // st.push(30);
        st.push(40);
        st.push(50);
        deleteMid(st);
        while (!st.isEmpty()) {
            int p = st.pop();
            System.out.println(p+" ");
        }
    }
}
