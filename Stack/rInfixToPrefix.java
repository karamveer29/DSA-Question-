import java.util.Stack;
public class rInfixToPrefix {
    static int precedence(char c){
        if(c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 2;
        if(c == '^') return 3;
        return -1;
    }
    static String convert(String exp){
        StringBuilder rev = new StringBuilder(exp).reverse();
        for(int i=0; i< rev.length(); i++){
            if(rev.charAt(i) == '(')
                rev.setCharAt(i, ')');
            else if(rev.charAt(i) == ')')
                rev.setCharAt(i, '(');
        }
        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for(char c: rev.toString().toCharArray()){
            if (Character.isLetterOrDigit(c))
                postfix.append(c);
            else if (c == '(')
                st.push(c);
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(')
                    postfix.append(st.pop());
                st.pop();
            }
            else {
                while (!st.isEmpty() && precedence(c) < precedence(st.peek()))
                    postfix.append(st.pop());
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }
        return postfix.reverse().toString();
         
        }
    
    public static void main(String[] args) {
        System.out.println(convert("(A-B/C)*(A/K-L)"));
    }
}
