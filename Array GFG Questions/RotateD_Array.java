// Given an array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.

// Examples:

// Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
// Output: {3, 4, 5, 6, 1, 2}
// Explanation: After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}


// Input: arr[] = {1, 2, 3}, d = 4
// Output: {2, 3, 1}
// Explanation: The array is rotated as follows:


// After first left rotation, arr[] = {2, 3, 1}
// After second left rotation, arr[] = {3, 1, 2}
// After third left rotation, arr[] = {1, 2, 3}
// After fourth left rotation, arr[] = {2, 3, 1}
public class RotateD_Array {
    static void RotateArray(int[] arr, int d){
        int n = arr.length;
        d %= n;
        int[] temp = new int[n];
        // n-d for  the element to front of temp
        for(int i = 0; i<n-d; i++)
            temp[i] = arr[d+ i];

            // first d element to back of temp
            for(int i =0; i<d; i++)
            temp[n-d+i] = arr[i];

            // copy element temp inarr
            for(int i =0; i<n; i++)
                arr[i] = temp[i];  

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int d = 2;
        RotateArray(arr, d);
        for(int i =0; i<arr.length; i++)
        System.out.print(arr[i]);
    }
}
