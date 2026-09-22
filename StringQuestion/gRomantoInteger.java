import java.util.Scanner;

public class gRomantoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        int n = s.length();
        int result = 0;
        for(int i=0; i<n; i++){
            int current = value(s.charAt(i));

            if (i + 1 < s.length() && current < value(s.charAt(i + 1))) {
                result = result - current;
            } else {
                result = result + current;
            }          
        }
        System.out.println("Integer value: " + result);
    }
    static int value(char c){
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        if(c == 'M') return 1000;
        return 0;
    }
}
