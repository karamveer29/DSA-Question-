// Input Format:
//  N = 5, array[] = {1,2,4,5}
// Result:
//  3
// Explanation: 
// In the given array, number 3 is missing. So, 3 is the answer.

// Example 2:
// Input Format:
//  N = 3, array[] = {1,3}
// Result:
//  2
// Explanation: 
// In the given array, number 2 is missing. So, 2 is the answer.

// For i = 1, flag = 0
// We will try to find 1 in the array using linear 
// search and in the first index, we can find it and 
// the flag will be 1. So, it is not the missing number.

// For i = 2, flag = 0
// We will try to find 2 in the given array using linear 
// search. But number 2 is not present and the flag will 
// remain 0. So, we will return 2 as it is the missing number.
public class MissingNumber {
    static int missingnum(int[] arr, int n){
        for(int i = 1; i<=n; i++){
            int flag = 0;
            for(int j=0; j<n-1; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;  
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,4,5};
        int ans = missingnum(arr, n);
        System.out.println("The missing number is"+ans);
    }
}
