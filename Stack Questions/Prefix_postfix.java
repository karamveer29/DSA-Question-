// Examples: 

// Input :  Prefix :  *+AB-CD
// Output : Postfix : AB+CD-*
// Explanation : Prefix to Infix :  (A+B) * (C-D)
//                          Infix to Postfix :  AB+CD-*

// Input :  Prefix :  *-A/BC-/AKL
// Output : Postfix : ABC/-AK/L-*
// Explanation : Prefix to Infix :  (A-(B/C))*((A/K)-L)
//                          Infix to Postfix : ABC/-AK/L-* 
import java.util.*;
public class Prefix_postfix {
        static boolean isOperator(char x)
    {
        switch (x) {
        case '+':
        case '-':
        case '/':
        case '*':
            return true;
        }
        return false;
    }
    static String preToPost(String exp){
        Stack<String> s = new Stack<String>();
        int l = exp.length();
        for(int i=l-1; i>=0; i--){
            if(isOperator(exp.charAt(i))){
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                String temp = op1 + op2 + exp.charAt(i);
                s.push(temp);
            }else{
                s.push(exp.charAt(i)+" ");
            }
        }
        return s.peek();
    }
    public static void main(String[] args) {
        String exp = "-A/BC-/AKL";
        System.out.println("Postfix :"+preToPost(exp));
    }

}
