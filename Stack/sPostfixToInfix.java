import java.util.*;
import java.util.Stack;

public class sPostfixToInfix {
    static String convert(String exp){
        Stack<String> st = new Stack<>();
        for(char c : exp.toCharArray()){
            if (Character.isLetterOrDigit(c)) {
                st.push(c + "");
            } else {
                String b = st.pop();
                String a = st.pop();
                st.push("(" + a + c + b + ")");
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        System.out.println(convert("AB+CD-*"));
    }
}
