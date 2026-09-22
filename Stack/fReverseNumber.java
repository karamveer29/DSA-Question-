// Reverse Number using Stack

import java.util.Scanner;
import java.util.Stack;

public class fReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num != 0) {
            stack.push(num % 10);
            num /= 10;
        }

        System.out.print("Reversed Number: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
