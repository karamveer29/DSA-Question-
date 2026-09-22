// Area of largest rectangle in Histogram
// Example:

// Input: N =6, heights[] = {2,1,5,6,2,3}

// Output: 10
// Approach 
// Step : 1- Steps to be done for finding left smaller element
// Step:2- step to be done for finding Right smaller Element
// Step : 3= After finding the right smaller and left smaller of each subsequent array elememt 
// Area for first index - ( 0 - 0 +1 ) * 2 = 2

// Area for second index - (6 - 0 + 1) * 1 = 6

// Area for third index - (3 - 2 +1 ) * 5 = 10

// Area for fourth index - (3 - 3 + 1 ) * 6 = 6

// Area for fifth index - (5 - 2 +1 ) * 2 = 8

// Area for sixth index - (5 - 5  + 1) * 3 = 3

// Area for seventh index - (6 - 0 +1) * 1  = 7

// So, the maximum area out of these is 10 sq units.
import java.util.*;
import java.util.Stack;
public class Histogram {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack < Integer > st = new Stack < > ();
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) leftSmall[i] = 0;
            else leftSmall[i] = st.peek() + 1;
            st.push(i);
        }

        // clear the stack to be re-used
        while (!st.isEmpty()) st.pop();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) rightSmall[i] = n - 1;
            else rightSmall[i] = st.peek() - 1;

            st.push(i);
        }

        int maxA = 0;
        for (int i = 0; i < n; i++) {
            maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
        }
        return maxA;

    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3,1};
        int n = 7;
        System.out.println("The largest area in the histogram is:"+largestRectangleArea(arr));
    }
}
