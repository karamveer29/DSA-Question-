public class AVGNumber {
    public static double calculateAverage(double a, double b, double c){
        return(a + b + c)/3;

    }
    public static void main(String[] args) {
        double a = 10, b =20, c = 30;
        double average = calculateAverage(a, b, c);
        System.out.println("The average number is "+ a+","+b+","+c+"is :"+average);
    }
}
