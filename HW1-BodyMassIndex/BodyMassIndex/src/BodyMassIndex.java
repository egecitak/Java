import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height in meters with a comma: ");
        double height = input.nextDouble();
        System.out.print("Please enter your weight with a comma: ");
        double weight = input.nextDouble();
        double index = weight / Math.pow(height, 2);

        System.out.println("Your body-mass index: " + index);
    }
}
