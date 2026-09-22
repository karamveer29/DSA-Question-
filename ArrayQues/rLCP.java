// Longest Common Prefix 

import java.util.Scanner;

public class rLCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        String prefix = s[0];
        for(int i=0; i<n; i++){
            while (!s[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    System.out.println("No common prefix");
                    return;
                }
            }
        }
        System.out.println("Longest Common Prefix " + prefix);

    }
}
