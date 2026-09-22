// peek(top Element if stack)

import java.util.Scanner;

public class dPeekStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[5];
        int top = -1;
        stack[++top] = 10;
        stack[++top] = 20;
        stack[++top] = 30;
        stack[++top] = 40;
        if(top == -1){
            System.out.println("Stack is empty ");
        }else{
            System.out.println("Top element is: "+ stack[top]);
        }
    }
}
