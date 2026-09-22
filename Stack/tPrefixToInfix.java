import java.util.Stack;
public class tPrefixToInfix {
    static String convert(String exp){
        Stack<String> st = new Stack<>();
        int n = exp.length();
        for(int i = n - 1; i >= 0; i--){
            char c = exp.charAt(i);

            if(Character.isLetterOrDigit(c)){
                st.push(c +"");
            }else{
                String a = st.pop();
                String b = st.pop();
                st.push("(" + a + c + b + ")");
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        System.out.println(convert("*+AB-CD"));
    }
}
