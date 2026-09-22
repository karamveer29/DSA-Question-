// Reverse a String using Stack
// Input: s = "GeeksQuiz"
// Output: ziuQskeeG

// Input: s = "abc"
// Output: cba
import java.util.Stack;
public class gfg2 {
    public static String reverse(String s){
        Stack<Character> st = new Stack();
        for(char c : s.toCharArray())
            st.push(c);
            StringBuilder res = new StringBuilder();
            while (!st.isEmpty()) {
                res.append(st.pop());
            }
            return res.toString();

    }
    public static void main(String[] args) {
        String s ="jagure";
        System.out.println(s);
        System.out.println(reverse(s));
    }
}
