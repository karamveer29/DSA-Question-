// Valid Parentheses in an Expression
// Input: s = "[{()}]"
// Output: true
// Explanation:  All the brackets are well-formed.

// Input: s = "[()()]{}"
// Output: true
// Explanation: All the brackets are well-formed.

// Input: s = "([]"
// Output: false
// Explanation: The expression is not balanced as there is a missing ')' at the end.
import java.util.Stack;
public class gfg1 {
    public static String reverse(String s){
        Stack<Character> st = new Stack();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else{
                 // and if the top of the stack is a matching opening bracket
                if (!st.empty() && 
                    ((st.peek() == '(' && s.charAt(i) == ')') ||
                     (st.peek() == '{' && s.charAt(i) == '}') ||
                     (st.peek() == '[' && s.charAt(i) == ']'))) {
                    st.pop(); 
                }else{
                    return false;
                }
                
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        String s = {([])};
        if(isBalanced(s))
           System.out.println("true");
        else
            System.out.println("false");   
    }
}
