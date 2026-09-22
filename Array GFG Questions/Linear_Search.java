// Example 1:
// Input: arr[]= 1 2 3 4 5, num = 3
// Output: 2
// Explanation: 3 is present in the 2nd index

// Example 2:
// Input: arr[]= 5 4 3 2 1, num = 5
// Output: 0
// Explanation: 5 is present in the 0th index
public class Linear_Search {
    static int search(int arr[], int n, int num){
        for(int i=0; i<n; i++){
            if(arr[i] == num)
                return i;
            }
            return -1;
        
        }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Array to search in
        int num = 4; // Number to search for
        int n = arr.length; // Length of the array
        int val = search(arr, n, num); // Call the search method
        System.out.println(val); // Print the result

    }
}
