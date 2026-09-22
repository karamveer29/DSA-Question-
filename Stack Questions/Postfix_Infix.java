// Examples: 

// Input: abc++
// Output: (a + (b + c))
// Explanation: Infix expression is  (a + (b + c)) for expression abc++

// Input: ab*c+
// Output: ((a*b)+c)
// Explanation: Infix expression is  ((a*b)+c) for expression ab*c+

// Input: abc+*d/
// Output: (((a * (b + c))) / d)
// Explanation: Infix expression is (((a * (b + c)))/d) for expression abc+*d/
import java.util.*;

public class Postfix_Infix {
    static boolean isOperator(char x) {
        return x == '+' || x == '-' || x == '*' || x == '/';
    }

    static String getInfix(String exp) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (!isOperator(c)) {
                st.push(c + "");
            } else {
                String op1 = st.pop();
                String op2 = st.pop();
                String temp = "(" + op2 + c + op1 + ")";
                st.push(temp);
            }
        }

        return st.peek();
    }

    public static void main(String[] args) {
        String exp = "ab*c+";
        System.out.println(getInfix(exp));  // Output: ((a*b)+c)
    }
}
