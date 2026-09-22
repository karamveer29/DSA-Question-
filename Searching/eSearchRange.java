public class eSearchRange {
    public static void main(String[] args){
        int [] arr = {18, 12, -7, 3, 14, 28};
        int target = 12;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        int n = arr.length;
        if(n == 0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
