import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        sc.close();
        int n =5; 
        boolean isPrime = true;
        if(n<= 1){
            isPrime = false;

        }else{
            for(int i =2; i<=Math.sqrt(num); i++){
                if(num * i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime)
            System.out.println(num+"The number is prime");
        else
            System.out.println(num+"The number is not prime");
        
    }
}
