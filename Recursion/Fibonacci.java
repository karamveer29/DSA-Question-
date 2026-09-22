            // method 1
// public class Fibonacci {
//     static void printfib(int a, int b, int n){
//         if(n==0){
//             return;
//         }
//         int c =  a+b;
//         System.out.println(c);
//         printfib(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         int a=0, b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         printfib(a, b, n-2);

//     }
// }
            //    method-2
public class Fibonacci {
    static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }


    public static void main(String[] args) {
        System.out.println(6);
    }
}
