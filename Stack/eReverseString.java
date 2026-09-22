// Reverse string using stack

import java.util.*;

public class eReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        System.out.print("Reversed String: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
