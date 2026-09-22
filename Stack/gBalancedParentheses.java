import java.util.Scanner;
import java.util.Stack;

public class gBalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter expression: ");
        String expr = sc.nextLine();

        boolean balanced = true;

        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    balanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty())
            balanced = false;
        if (balanced) {
            System.out.println("Expression is Balanced");
        } else {
            System.out.println("Expression is Not Balanced");
        }

    }
}
