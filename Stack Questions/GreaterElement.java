// Next Greater Element Using Stack
// Examples:

// Example 1: 

// Input: N = 11, A[] = {3,10,4,2,1,2,6,1,7,2,9}

// Output: 10,-1,6,6,2,6,7,7,9,9,10

// Explanation: For the first element in A ,i.e, 3, the greater element which comes 
// next to it while traversing and is closest to it is 10. Hence,10 is present on 
// index 0 in the resultant array. Now for the second element,i.e, 10, there is no 
// greater number and hence -1 is it’s next greater element (NGE). Similarly, we got 
// the NGEs for all other elements present in A.  

// Example 2:

// Input:  N = 6, A[] = {5,7,1,7,6,0}

// Output: 7,-1,7,-1,7,5
// import java.io.*;
import java.util.*;
import java.util.Stack;

public class GreaterElement {
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack< Integer > st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();

            }
            if (i < n) {
                if (st.isEmpty() == false)
                    nge[i] = st.peek();
                else
                    nge[i] = -1;
            }
            st.push(nums[i % n]);

        }
        return nge;
    }

    public static void main(String[] args) {
        int arr1[] ={5,7,1,2,6,0};
        int arr2[] = nextGreaterElement(arr1);
        System.out.print("The next greater element are ");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }

    }
}