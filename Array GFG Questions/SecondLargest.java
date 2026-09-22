// Method 1
// public class SecondLargest {
//     public static void main(String[] args) {
//         int[] arr = { 12, 35, 1, 10, 34, 1 };
//         int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
//         for (int num : arr) {
//             if (num > first) {
//                 second = first;
//                 first = num;
//             } else if (num > second && num != first) {
//                 second = num;
//             }
//         }
//         System.out.println("Second Largest Element:" + second);
//     }
// }
// Method 2 (Recursive Method)

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargest{
    static int  getSecondLargest(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=n-2; i>=0; i--){
            if(arr[i] != arr[n - 1]){
                return arr[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34,2};
        System.out.println(getSecondLargest(arr));
    }
}
