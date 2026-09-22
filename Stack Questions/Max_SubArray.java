// Sum of Max of Sub Array
// Examples:  

// Input: arr[] = [1, 3, 2]
// Output: 15
// Explanation: All possible non-empty subarrays of [1, 3, 2] are 
// {1}, {3}, {2}, {1, 3}, {3, 2} and {1, 3, 2}. The maximum elements of 
// the subarrays are 1, 3, 2, 3, 3, 3 respectively. The sum will be 15.

// Input: arr[] = [3, 1]
// Output: 7
// Explanation: All possible non-empty subarrays of [3, 1] are 
// {3}, {1} and {3, 1}. The maximum elements of the subarrays are 3, 1, 3 
// respectively. The sum will be 7.
import java.util.*;
public class Max_SubArray 
{
    static int SumOfMax(int[] arr){
        int n = arr.length;
        int res = 0;

        for(int i=0; i<n; i++){
            int currMax = arr[i];

            for(int j=i; j<n;j++){
                currMax = Math.max(currMax, arr[j]);
                res += currMax;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2};
        System.out.println(SumOfMax(arr));
    }
}
