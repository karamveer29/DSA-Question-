import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number: ");
        int num = sc.nextInt();
//         int[] arr = new int[num];
        
//         for(int i = 0; i < num; i++) {
//             arr[i] = sc.nextInt();
//         }
        int rev = 0;
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
// import java.util.Scanner;

// public class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int originalNum = num; // optional: to keep original value
//         int rev = 0;

//         while (num != 0) {
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num = num / 10;
//         }

//         System.out.println("Reversed number of " + originalNum + " is: " + rev);
//         sc.close();
//     }
// }
