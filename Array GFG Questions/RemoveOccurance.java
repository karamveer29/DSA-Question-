public class RemoveOccurance {
    static int removeElement(int[] arr, int ele){
        int k = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != ele){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int [] arr = {3,2,2,3};        // {0,1,3,0,2,2,4,2};
        int ele = 3; //2;
        System.out.println(removeElement(arr, ele));
    }
    
}
