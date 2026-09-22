import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int revNum = 0;
        while(n > 0){
            int r = n % 10;
            revNum = (revNum * 10) + r;
            n = n/ 10;
        }
        System.out.println(revNum);
    }
}
