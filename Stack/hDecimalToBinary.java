// convert decimal to binary 
import java.util.Scanner;
import java.util.Stack;

public class hDecimalToBinary {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Stack<Integer> stack = new Stack<>();

        // System.out.print("Enter decimal number: ");
        // int num = sc.nextInt();

        // while (num > 0) {
        //     stack.push(num % 2);
        //     num /= 2;
        // }

        // System.out.print("Binary: ");
        // while (!stack.isEmpty()) {
        //     System.out.print(stack.pop());
        // }
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();

        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }

        System.out.print("Binary number: ");
        printBinary(stack);
    }
    
    static void printBinary(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;

        System.out.print(stack.pop());
        printBinary(stack);
    }

}
