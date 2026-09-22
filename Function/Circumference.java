import java.util.Scanner;

public class Circumference {
    public static double calculateCircumference(double radius){
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = scanner.nextDouble();

        double Circumference = calculateCircumference(radius);
        System.out.println("The circumference of the circle is:"+Circumference);
    }
}
