//  Given an array of non-negative integers representation elevation of ground. Your task is to find the water that can be trapped after rain.

// Examples:

// Example 1:

// Input: height= [0,1,0,2,1,0,1,3,2,1,2,1]

// Output: 6

// Explanation: As seen from the diagram 1+1+2+1+1=6 unit of water can be trapped

public class Tappingwater {
    static int trap(int[] height ){
        int left = 0, right = 0;
        int res = 0;
        int maxLeft = 0, maxRight = 0;
        while(left <= right){
            if(height[left] <= height[right]){
               if(height[left] >= maxLeft){
                maxLeft = height[left];
               }
               else{
                res += maxLeft - height[left];
               }
               left++;
            }else{
                if(height[right] >= maxRight){
                    maxRight = height[right];
                }else{
                    res += maxRight - height[right];
                }right--;
             
            }
        }return res;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The duplicates element is "+trap(arr));
    }
}
