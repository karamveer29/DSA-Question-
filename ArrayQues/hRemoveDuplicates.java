import java.util.Scanner;

public class hRemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int index = 1; 

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
