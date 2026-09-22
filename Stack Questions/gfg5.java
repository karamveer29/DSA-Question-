// Delete middle element of a stack
// Input: s = [10, 20, 30, 40, 50]
// Output: [50, 40, 20, 10]
// Explanation: The bottom-most element will be 10 and the top-most 
// element will be 50. Middle element will be element at index 3 
// from bottom, which is 30. Deleting 30, stack will look like [10, 20, 40, 50].
import java.util.*;
public class gfg5 {
    public static void deleteMid(Stack<Integer> st, int size){
        ArrayList<Integer> s = new ArrayList<>();
        while(!st.isEmpty()){
            s.add(st.pop());
        }
        int mid = size / 2;
        s.remove(mid);
        for(int i=s.size() - 1; i>=0; i--){
            st.push(s.get(i));
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int size = st.size();
        deleteMid(st, size);
        while (!st.isEmpty()) {
            int p = st.pop();
            System.out.println(p+" ");
        }
    }
}
