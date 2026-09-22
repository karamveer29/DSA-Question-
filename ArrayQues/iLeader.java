import java.util.ArrayList;
import java.util.Scanner;

public class iLeader {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                result.add(arr[i]);
            }
        }
        System.out.println("Leader in the array:");
        for(int x : result){
            System.out.println(x + " ");
        }
    }
}
