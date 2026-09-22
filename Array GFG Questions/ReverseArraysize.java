// Reverse an Array in groups of given size


// Examples: 

// Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], k = 3 
// Output: 3, 2, 1, 6, 5, 4, 9, 8, 7


// Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 5 
// Output: 5, 4, 3, 2, 1, 8, 7, 6


// Input: arr[] = [1, 2, 3, 4, 5, 6], k = 1 
// Output: 1, 2, 3, 4, 5, 6


// Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 10 
// Output: 8, 7, 6, 5, 4, 3, 2, 1
public class ReverseArraysize {
    // Function to reverse every sub-array of size k
    static void reverseInGroups(int[] arr, int k) {
        int n = arr.length; 

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); 

            // Reverse the sub-array
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;

        reverseInGroups(arr, k);

        // Print modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
