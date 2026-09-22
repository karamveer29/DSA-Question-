// Nearest smaller numbers on left side in an array
// Input: arr = [1, 6, 2]
// Output: [-1, 1, 1,]
// Explanation: There is no number at the left of 1. Smaller number than 6 and 2 is 1.

// Input: arr = [1, 5, 0, 3, 4, 5]
// Output: [-1, 1, -1, 0, 3, 4]
// Explanation: Upto 3 it is easy to see the smaller numbers. But for 4 
// the smaller numbers are 1, 0 and 3. But among them 3 is closest. 
// Similarly for 5 it is 4.
import java.util.Arrays;
public class gfg11 {
    public static void nearestSmaller(int[] arr){
        int n = arr.length;
        System.out.println("-1");
        for(int i=0; i<n; i++){
            int j;
            for( j=i-1; j>= 0; j--){
                if(arr[j] < arr[i]){
                    System.out.println(arr[j]+" ");
                    break;
                }
            }
            if(j == -1)
               System.out.println("-1");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,0,3,4,5};
        nearestSmaller(arr);
    }
}
