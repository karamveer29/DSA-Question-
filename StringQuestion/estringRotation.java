import java.util.Scanner;

public class estringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String :");
        String s1 = sc.nextLine();
        
        System.out.println("Enter the second String :");
        String s2 = sc.nextLine();

        if(areRotation(s1,s2)){
            System.out.println("String are rotated to each other");
        }else{
            System.out.println("String are not rotated each other");
        }
    }
        static boolean areRotation(String s1, String s2){
            if(s1.length() != s2.length()) return false;
            String temp = s1+s2;
            return temp.contains(s2);

    }
}