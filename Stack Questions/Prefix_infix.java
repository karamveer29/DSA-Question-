// Examples: 

// Input :  Prefix :  *+AB-CD
// Output : Infix : ((A+B)*(C-D))

// Input :  Prefix :  *-A/BC-/AKL
// Output : Infix : ((A-(B/C))*((A/K)-L))
import java.util.*;
public class Prefix_infix {
    static boolean isOperator(char x){
        switch(x){
            case'+':
            case'-':
            case'*':
            case'/':
            case'%':
               return true;
        }
        return false;
    }
    public static String covert(String str){
        Stack<String> st = new Stack<>();
        int l = str.length();
        for(int i=l-1; i>= 0; i--){
            char c = str.charAt(i);
            if(isOperator(c)){
                String op1 = st.pop();
                String op2 = st.pop();

                String temp="("+op1 + c + op2 +")";
                st.push(temp);
            }
            else{
                st.push(c+" ");
            }
        }return st.pop();
    }
    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";
        System.out.println("Infix: "+covert(exp));
    }
}
