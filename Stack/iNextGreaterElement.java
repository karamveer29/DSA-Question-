import java.util.*;
public class iNextGreaterElement {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = {4,5,2,25};
        int n = arr.length;
        int[] res = new int[n];
        for(int i=n-1; i>= 0; i--){
            while(!st.empty() && st.peek() <= arr[i]){
                st.pop();
            }
            
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
