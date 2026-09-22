import java.util.Scanner;

public class Eligiblity{
    public static String checkEligbility(int age){
        if(age>=18){
            return "Eligible for vote";
        }else{
            return "Not eligible for vote";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println(checkEligbility(age));
        
    }

    
}