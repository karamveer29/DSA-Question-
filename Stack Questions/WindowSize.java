// Maximum of the minimum of every window size in a given array
// Example:

// Input: arr[] = [10, 20, 30]
// Output: [30, 20, 10]
// Explanation: 
// First element in output indicates maximum of minimums of all 
// windows of size 1. Minimums of windows of size 1 are [10], [20], [30]. 
// Maximum of these minimums are 30 and similarly other 
// outputs can be computed

// Input: arr[] = [10, 20, 30, 50, 10, 70, 30]
// Output: [70, 30, 20, 10, 10, 10, 10]
// Explanation: The first element in the output indicates the maximum of minimums of all windows of size 1. 
// Minimums of windows of size 1 are [10], [20], [30], [50], [10], [70] and [30]. 
// Maximum of these minimums is 70
// The second element in the output indicates the maximum of minimums of all windows of size 2. 
// Minimums of windows of size 2 are [10], [20], [30], [10], [10], and [30]. 
// Maximum of these minimums is 30
// The third element in the output indicates the maximum of minimums of all windows of size 3. 
// Minimums of windows of size 3 are [10], [20], [10], [10] and [10]. 
// Maximum of these minimums is 20
// Similarly, other elements of output are computed. 
import java.util.*;
public class WindowSize {
    static ArrayList<Integer> maxOfMins(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>
        (Collections.nCopies(n, 0));


        for (int k = 1; k <= n; k++) {


            int maxOfMin = Integer.MIN_VALUE;

            
            for (int i = 0; i <= n - k; i++) {

                // Find minimum of current window
                int minVal = arr[i];
                for (int j = 1; j < k; j++) {
                    if (arr[i + j] < minVal)
                        minVal = arr[i + j];
                }

                
                if (minVal > maxOfMin)
                    maxOfMin = minVal;
            }

            // Store max 
            res.set(k - 1, maxOfMin);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr ={10,20,30,50,10,70,30};
        ArrayList<Integer> res =  maxOfMins(arr);
        for(int x : res)
           System.out.println(x+" ");

    }
}
