import java.util.Scanner;

public class bSmallestSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("target :");
        int target = sc.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0, minLen = Integer.MAX_VALUE;
        int start = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while (sum >= target) {
                minLen = Math.min(minLen, i - start + 1);
                sum -= arr[start++];
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println("The smallest sub Array is: "+minLen);
        }

    }
}
