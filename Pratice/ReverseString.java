package Pratice;


import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        int n = s.length();
        String rev = "";
        for(int i=n-1; i>=0; i--){
            rev += s.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
    }

    
}