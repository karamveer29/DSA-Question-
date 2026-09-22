// Evaluation of Postfix Expression
// Input: arr = ["2", "3", "1", "*", "+", "9", "-"]
// Output: -4
// Explanation: If the expression is converted into an infix expression, it will be 2 + (3 * 1) - 9 = 5 - 9 = -4.
import java.util.Stack;
public class gfg9 {
    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            
            if (ch == ' ') continue;

            
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }

            // pop two elements and apply operation
            else {
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (ch) {
                    case '+': stack.push(val1 + val2); break;
                    case '-': stack.push(val1 - val2); break;
                    case '*': stack.push(val1 * val2); break;
                    case '/': stack.push(val1 / val2); break;
                }
            }
        }

        return stack.pop(); 
    }

    public static void main(String[] args) {
        String expr = "23*54*+9-"; // Equivalent to: (2*3 + 5*4 - 9)
        int result = evaluatePostfix(expr);
        System.out.println("Result = " + result);
    }
}
