// Sliding window maximum
// Example 1:

// Input: arr = [4,0,-1,3,5,3,6,8], k = 3

// Output: [4,3,5,5,6,8]

// Explanation: 

// Window position                   Max
// ------------------------         -----
// [4  0  -1] 3  5  3  6  8           4
//  4 [0  -1  3] 5  3  6  8           3
//  4  0 [-1  3  5] 3  6  8           5
//  4  0  -1 [3  5  3] 6  8           5
//  4  0  -1  3 [5  3  6] 8           6
//  4  0  -1  3  5 [3  6  8]          8

// For each window of size k=3, we find the maximum element in the window and add it to our output array.

// Example 2:

// Input: arr= [20,25], k = 2

// Output: [25]

// Explanation: There’s just one window is size 2 that is possible and the maximum of the two elements is our answer.
import java.util.*;
public class SlidingWindow {
    static void GetMax(int arr[], int l, int r, ArrayList<Integer> max){
        int i, maxi = Integer.MIN_VALUE;
        for(i=l; i<=r; i++)
           maxi = Math.max(maxi, arr[i]);
        max.add(maxi);   
    }
    static ArrayList<Integer> maxSlidingWindow(int[] arr, int k){
        int left =0, right =0;
        int i,j;
        ArrayList<Integer> max = new ArrayList<>();
        while(right <k - 1){
            right++;
        }while (right < arr.length) {
            GetMax(arr, left, right, max);
            left++;
            right++;
        }
        return max;
    }
    public static void main(String[] args) {
        int i, j, n, k = 3, x;
        int arr[]={4,0,-1,3,5,3,6,8};
        ArrayList < Integer > ans;
        ans = maxSlidingWindow(arr, k);
        System.out.println("Maximum element in every " + k + " window ");
        for (i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + "  ");
    }
}
