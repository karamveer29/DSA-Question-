public class ReverseArray {
    static void printArray(int ans[], int n){
        System.out.println("Reversed the given array");
        for(int i =0; i<n; i++){
            System.out.println(ans[i]+" ");
        }
    }
    static void reversearray(int arr[], int n){
        int[] ans = new int[n];
        for(int i = n-1; i>= 0; i--){
            ans[n - i - 1] = arr[i];
        }
        printArray(ans, n);
    }
    public static void main(String[] args) {
        int n =6;
        int arr[] = {1,2,3,4,5,6};
        reversearray(arr, n);

    }
}
