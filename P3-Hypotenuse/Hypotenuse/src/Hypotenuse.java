import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter one of the orthogonal sides: ");
        int firstSide = input.nextInt();
        System.out.print("Enter the other orthogonal side: ");
        int secondSide = input.nextInt();

        double squareSum = Math.pow(firstSide, 2) + Math.pow(secondSide, 2);
        double hypotenuse = Math.sqrt(squareSum);

        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.println("Circumference: " + (firstSide + secondSide + hypotenuse));
        System.out.println("Area: " + ((firstSide * secondSide) / 2));
    }
}
