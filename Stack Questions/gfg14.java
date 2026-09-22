// Infix to Postfix Expression
// Input: s = "A*(B+C)/D"
// Output: ABC+*D/

// Input: s = "a+b*(c^d-e)^(f+g*h)-i"
// Output: abcd^e-fgh*+^*+i- 
import java.util.*;
public class gfg14 {
    public static int precedence(char ch){
        switch (ch) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': 
            case '%': return 2; 
            case '^': return 3; 
            
        }
        return -1;
    }
    public static String infixToPostfix(String expression){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch : expression.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }
            else if(ch =='('){
                stack.push(ch);
            }else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop());
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String infix = "a+b(c^d-e)^(f+g*h)-i";
        System.out.println("INFIX:"+infix);
        System.out.println("POSTFIX:"+infixToPostfix(infix));
    }
}
