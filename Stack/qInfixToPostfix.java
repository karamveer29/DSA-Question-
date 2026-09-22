import java.util.Stack;
public class qInfixToPostfix {
    static int precedence(char c){
        if(c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 2;
        if(c == '^') return 3;
        return -1;
    }
    static String Convert(String exp){
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            else if (c == '(') {
                st.push(c);
            }
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(')
                    result.append(st.pop());
                st.pop(); // remove '('
            }
            else {
                while (!st.isEmpty() && precedence(c) <= precedence(st.peek()))
                    result.append(st.pop());
                st.push(c);
            }
        }
        while(!st.isEmpty())
            result.append(st.pop());

        return result.toString();

    }
    public static void main(String[] args) {
        System.out.println(Convert("A+B*(C-D)"));
    }
}
