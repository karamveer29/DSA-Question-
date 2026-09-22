import java.util.Scanner;

public class sremoveElement {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println("Enter size :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to remove: ");
        int val = sc.nextInt();
        int idx = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != val){
                arr[idx++] = arr[i];
            }
    
        }
        for(int i=0; i<idx; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
