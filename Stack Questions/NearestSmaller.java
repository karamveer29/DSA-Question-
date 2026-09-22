// Nearest smaller numbers on left side in an array
// Examples: 

// Input: arr = [1, 6, 2]
// Output: [-1, 1, 1,]
// Explanation: There is no number at the left of 1. Smaller number than 6 and 2 is 1.

// Input: arr = [1, 5, 0, 3, 4, 5]
// Output: [-1, 1, -1, 0, 3, 4]
// Explanation: Upto 3 it is easy to see the smaller numbers. But for 4 
// the smaller numbers are 1, 0 and 3. But among them 3 is closest. 
// Similarly for 5 it is 4.
import java.util.Arrays;
public class NearestSmaller {
    public static void prevSmaller(int[] arr){
        System.out.println("-1");
        for(int i=1; i<arr.length; i++){
            int j;
            for(j=i-1; j>=0; j--){
                if(arr[j] <arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j == -1){
                System.out.print("-1");
            }
        }
    }
    public static void main(String[] args) {
        // int[] arr={1,6,2};
        int[] arr = {1,5,0,3,4,5};
        prevSmaller(arr);
    }
}
