public class SumCalculation {
    static void printsum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        System.out.println(i);
        printsum(i+1, n, sum);

    }
    public static void main(String[] args) {
        printsum(1, 6, 0);
    }
}
