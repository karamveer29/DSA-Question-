// Push N element into stack and Display

import java.util.Scanner;

public class cPushAndDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack size :");
        int n = sc.nextInt();
        int[] stack = new int[n];
        int top = -1;
        System.out.print("Enter number of element to push :");
        int element = sc.nextInt();
        for(int i=0; i<n; i++){
            if(top == n-1){
                System.out.println("Stack Overflow!");
                break;
            }
            stack[++top] = sc.nextInt();
        }
        System.out.println("Stack Elements :");
        for(int i = top; i>= 0; i--){
            System.out.println(stack[i] + "");
        }
    }
}
