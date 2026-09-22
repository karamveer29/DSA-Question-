// arr.size() / 2 times in the array.

// Examples : 

// Input : arr[] = [1, 1, 2, 1, 3, 5, 1]
// Output : 1
// Explanation: Note that 1 appear 4 times which is more than  7 / 2 times 


// Input : arr[] = [3, 3, 4, 2, 4, 4, 2, 4]
// Output :  -1 
// Explanation: There is no element whose frequency is greater than the half of the size of the array size.


// Input : arr[] = [3]
// Output : 3
// Explanation: Appears more than n/2 times

public class Majority_Element {
    static int majorityElement(int[] arr){
        int n = arr.length;
        for(int i =1; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > n/2){
                return arr[i];
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int[] arr = {3,3,4,2,4,4,2,4};
        System.out.println(majorityElement(arr));
    }
}