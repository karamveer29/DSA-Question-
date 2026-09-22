// Greater Common Divisor of two number 
public class GCD {
    public static void main(String[] args) {
        int a=30, b=60;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("Greater Common Divisor is:"+a);
    }
}
