import java.util.Scanner;

public class GreaterNumber {
    public static void findGreater(int a, int b){
        if(a>b){
            System.out.println(a+"is greater :");
        }else if (b>a) {
            System.out.println(b+"is greater");
        }else{
            System.out.println("Both number is eqal");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        findGreater(a, b);

    }
}
