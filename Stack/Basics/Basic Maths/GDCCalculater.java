import java.util.Scanner;

public class GDCCalculater {
    public static int findGDC(int a, int b){
        while(b != a){
            int temp = b;
            a = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int gdc = findGDC(num1, num2);
        System.out.println("The GDC of"+num1+"and"+num2+"is:"+gdc);
    }
}
