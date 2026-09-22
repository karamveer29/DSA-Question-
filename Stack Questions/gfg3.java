
// Postfix to Prefix Conversion
// Input :  Postfix : AB+CD-*
// Output : Prefix :  *+AB-CD
// Explanation : Postfix to Infix : (A+B) * (C-D)
//               Infix to Prefix :  *+AB-CD
import java.util.*;

public class gfg3 {

    // function to check if character
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

    // Convert postfix to Prefix expression
    static String postToPre(String post_exp)
    {
        Stack<String> s = new Stack<String>();

    
        int length = post_exp.length();

        
        for (int i = 0; i < length; i++) {

            
            if (isOperator(post_exp.charAt(i))) {

              
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();

               
                String temp
                    = post_exp.charAt(i) + op2 + op1;

                s.push(temp);
            }

            // if symbol is an operand
            else {

                // push the operand to the stack
                s.push(post_exp.charAt(i) + "");
            }
        }

        // concatenate all strings in stack and return the
        // answer
        String ans = "";
        for (String i : s)
            ans += i;
        return ans;
    }

    
    public static void main(String args[])
    {
        String post_exp = "AB+CD-*";

        
        System.out.println("Prefix : "
                           + postToPre(post_exp));
    }
}

