import java.util.Scanner;

public class gAllZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[cnt++] = arr[i];
            }
        }

        
        while (cnt < n) {
            arr[cnt++] = 0;
        }

        System.out.println("Array after moving all zeros to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
