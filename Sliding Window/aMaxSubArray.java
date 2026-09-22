import java.util.Scanner;

public class aMaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        int windowSum = 0;
        int maxSum = 0;
        for(int i=0; i<n; i++){
            windowSum += arr[i];
            if(i >= k-1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i - (k - 1)];
            }
        }
        System.out.println("The maximum two number sum is: "+maxSum);

    }
}