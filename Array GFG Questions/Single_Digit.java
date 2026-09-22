// Given an integer n, we need to repeatedly find the sum of 
// its digits until the result becomes a single-digit number.

// Examples:
// Input: n = 1234 
// Output: 1 
// Explanation:
// Step 1: 1 + 2 + 3 + 4 = 10 
// Step 2: 1 + 0 = 1


// Input: n = 5674
// Output: 4
// Explanation: 
// Step 1: 5 + 6 + 7 + 4 = 22 
// Step 2: 2 + 2 = 4
public class Single_Digit {
    static int singledigitsum(int n){
        int sum = 0;
        while(n>0 || sum>9){
            if(n==0){

                n = sum;
                sum = 0;
            }
            sum += n% 10;
            n/= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(singledigitsum(n));
    }
}
