import java.util.Scanner;

public class ptwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target Element : ");
        int target = sc.nextInt();

        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {   
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
            if (ans[0] != -1)
                break;
        }

        if (ans[0] == -1) {
            System.out.println("No pair found");
        } else {
            System.out.println("Indices: " + ans[0] + " " + ans[1]);
        }

        
    }
}
