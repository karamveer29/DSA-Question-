// Examples: 

// Input: a*b+c/d
// Output: +*ab/cd 

// Input: (a-b/c)*(a/k-l)
// Output: *-a/bc-/akl
import java.util.*;
public class Infix_Prefix {
    static boolean isOperator(char ch){
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch =='^');
    }
    static int operatorPrecedence(char op){
        if(op == '^') return 3;
        if(op == '*' || op == '/') return 2;
        if(op == '+' || op == '-') return 1;
        return -1;
    }
    static String convert(String s){
        Stack<Character> ch = new Stack<>();
        StringBuilder res = new StringBuilder();
        int size = s.length();
        for(int i=0; i<size; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
               res.append(s.charAt(i));
            }else if(s.charAt(i) =='('){
                ch.push(s.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
