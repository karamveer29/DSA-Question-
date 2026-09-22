import java.util.Scanner;
import java.util.Stack;

public class uEvaluatePostfix {

    static int applyOperator(char op, int b, int a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }

    static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // convert char to int
            } else {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(applyOperator(c, b, a));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter postfix expression: ");
        String exp = sc.next();

        System.out.println("Result = " + evaluate(exp));
    }
}
