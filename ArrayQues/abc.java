

// package ArrayQues;
import java.util.*;
public class abc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);  // Sort the array
        
        // Traverse from second last element backwards
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] != arr[n - 1]) {
                System.out.println(arr[i]);  // Print second largest
                return;
            }
        }
        
        // If all elements are equal
        System.out.println("No second largest element");
    }
}
