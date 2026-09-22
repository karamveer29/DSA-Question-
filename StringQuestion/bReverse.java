import java.util.Scanner;

public class bReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        int len = s.length();
        String rev = "";
        for(int i=len-1; i>= 0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("Reversed String :" + rev);
    }
}
