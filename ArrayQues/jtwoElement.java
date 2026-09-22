import java.util.HashMap;
import java.util.Scanner;

public class jtwoElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int needed = target - arr[i];
            if(map.containsKey(needed)){
                System.out.println("Two Element found: " + needed + " and " + arr[i]);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No pair found! ");

    }
}
