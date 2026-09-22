import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int number) {
        int originalnumber = number;
        int numdigit = String.valueOf(number).length();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numdigit);
            number = number / 10;
        }
        return sum == originalnumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
