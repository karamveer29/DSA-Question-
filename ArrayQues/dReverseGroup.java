import java.util.Scanner;

public class dReverseGroup {

   
    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Reverse array in groups of size k
    static void reverseInGroup(int[] arr, int n, int k) {
        helper(arr, 0, n, k);
    }

    // Recursive helper
    static void helper(int[] arr, int start, int n, int k) {
        if (start >= n) {
            return;
        }

        int end = Math.min(start + k - 1, n - 1);
        reverse(arr, start, end);
        helper(arr, start + k, n, k);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter group size k: ");
        int k = sc.nextInt();

        reverseInGroup(arr, n, k);

        System.out.println("Array after reversing in groups:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
