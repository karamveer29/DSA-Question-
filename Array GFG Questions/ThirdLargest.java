            //    Method -1
// import java.util.Arrays;

// public class ThirdLargest {
//     static int thirdlargestElement(int[] arr){
//         int n = arr.length;
//         Arrays.sort(arr);

//         return arr[n-3];
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,14,2,16,10,20};
//         System.out.println(thirdlargestElement(arr));
//     }
// }

public class ThirdLargest {
    static int thirdlargestElement(int[] arr){
        int n = arr. length;
        int first = Integer.MIN_VALUE,  second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i = 0; i< n; i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }else if(arr[i] > second){
                third = second;
                second = arr[i];
            }else if(arr[i] > third){
                third = arr[i];
            }
        }
        return third;
    }
    public static void main(String[] args) {
        int[] arr = {1,14,2,16,10,20};
        System.out.println(thirdlargestElement(arr));
    }
}
