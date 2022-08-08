import java.util.Scanner;

public class CirclePropertyCalculator {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius: ");
        double rad = input.nextDouble();
        System.out.print("Please enter the angle (360 for full circle): ");
        double ang = input.nextDouble();

        double area = (PI * Math.pow(rad, 2)) * (ang / 360);
        double circumference = 2 * PI * rad * (ang / 360);

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
