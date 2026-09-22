import java.util.Scanner;

public class tNextPermutation {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println("Enter size :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pivot = -1;
        n = arr.length;
        for(int i=n-2; i>= 0; i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(arr, 0, n-1);
            printArray(arr);
            return;
        }
        for(int i=n-1; i<pivot; i--){
            if(arr[i] > arr[pivot]){
                swap(arr, i, pivot);
                break;
            }
        }
        reverse(arr, pivot+1, n-1);
        printArray(arr);
    }
    static void reverse(int[] arr, int start, int end){
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int[] arr) {
        System.out.println("Next Permutation:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
