// Examples:

// Input: s = "A*(B+C)/D"
// Output: ABC+*D/

// Input: s = "a+b*(c^d-e)^(f+g*h)-i"
// Output: abcd^e-fgh*+^*+i- 
import java.util.*;
public class Infix_postfix {
     static int prec(char c) {
        if (c == '^') return 3;
        else if (c == '/' || c == '*') return 2;
        else if (c == '+' || c == '-') return 1;
        else return -1;
    }
    static String infixtoPostfix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

       for (char c : s.toCharArray()) {
            
           
            if (Character.isLetterOrDigit(c)) {
                res.append(c);
            } 
            
 
            // push it to the stack.
            else if (c == '(') {
                st.push(c);
            } 
            
           
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    res.append(st.pop());
                }
                st.pop();
            } 
            
            // If an operator is scanned
            else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek())) {
                    res.append(st.pop());
                }
                st.push(c);
            }
        }

        // Pop all the remaining elements from the stack
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixtoPostfix(exp));
    }
}
