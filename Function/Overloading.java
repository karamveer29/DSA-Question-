public class Overloading {
    public static int multiply(int a, int b){
        return a *  b;
    }
    public static double multiply(double x, double y){
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(multiply(4, 5));
        System.out.println(multiply(5.6, 7.8));
    }
}
