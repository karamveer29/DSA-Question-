// Find next Smaller of next Greater in an array
// Examples: 

// Input : arr[] = {5, 1, 9, 2, 5, 1, 7}
// Output:          2  2 -1  1 -1 -1 -1
// Explanation :  
// Next Greater ->      Right Smaller 
//    5 ->  9             9 ->  2 
//    1 ->  9             9 ->  2
//    9 -> -1            -1 -> -1
//    2 ->  5             5 ->  1
//    5 ->  7             7 -> -1
//    1 ->  7             7 -> -1
//    7 -> -1            -1 -> -1 

// Input  : arr[] = {4, 8, 2, 1, 9, 5, 6, 3}
// Output :          2  5  5  5 -1  3 -1 -1     

import java.util.ArrayList;

public class Smaller_Greater {
    static void nextSmallerOfNextGreater(int arr[], int n){
        ArrayList<Integer> st = new ArrayList<>();
         for(int i = 0; i < n - 1; i++) {
      int temp = arr[i];
      int next = -1;
      int ans = -1;
      for(int j = i + 1; j < n; j++) {
        if(arr[j] > temp) {
          next = j;
          break;
        }
      }
      if(next == -1) {
        st.add(-1);
      }
      else {
        for(int j = next + 1; j < n; j++) {
          if(arr[j] < arr[next]) {
            ans = j;
            break;
          }
        }
        if(ans == -1) {
          st.add(-1);
        }
        else {
          st.add(arr[ans]);
        }
      }
    }
    st.add(-1); // For last element of vector

    for(int x : st) {
      System.out.print(x + " ");
    }
    System.out.println();
  }
    public static void main(String[] args) {
        int arr[] = {5,1,9,2,5,1,7};
        int n = arr.length;
        nextSmallerOfNextGreater(arr, n);
    }
}
