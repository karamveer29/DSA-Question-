import java.util.*;
public class amain{
    public static void main(String[] args){
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = -3;
        boolean ans = linearSearch1(nums, target);
        System.out.println(ans);
        int res = linearSearch2(nums, target);
        System.out.println(ans);
        int sol = linearSearch3(nums, target);
        System.out.println(ans);



    }

    //  search the target and return true or false
    static boolean linearSearch1(int[] arr, int target){
        int n = arr.length;
        if(n == 0){
            return false;
        }
        for(int element : arr){
            if(element == target){
                return false;
            }
        }
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch3(int[] arr, int target){
        int n = arr.length;
        if(n == 0){
            return -1;
        }
        for(int i =0; i<n; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;


    }
}