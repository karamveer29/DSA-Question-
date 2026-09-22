// Next Greater Element (NGE) for every element in given Array
// Input: arr[] = [1, 3, 2, 4]
// Output: [3, 4, 4, -1]
// Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.
import java.util.ArrayList;
// import java.util.stream.Gatherer.Integrator;
public class gfg10 {
    static ArrayList<Integer> nextLargerElement(int[] arr){
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            res.add(-1);
        }
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[j] > arr[i]){
                    res.set(i,arr[j]);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        ArrayList<Integer> res =  nextLargerElement(arr);
        for(int x : res){
            System.out.print(x+" ");
        }
    }
}
