// Input: s = "geeksforgeeks"
// Output: 'f'

import java.util.Scanner;

public class fNonRepeating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();

        int n = s.length();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean isUnique = true;

            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("First Non-Repeating Character: " + s.charAt(i));
                found = true;
                break; // VERY IMPORTANT
            }
        }

        if (!found) {
            System.out.println("No Non-Repeating Character found");
        }

        
    }
}
