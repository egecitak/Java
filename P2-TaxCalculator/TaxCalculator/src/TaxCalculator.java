import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        System.out.print("Enter price: ");
        Scanner input = new Scanner(System.in);

        double price = input.nextDouble();
        double tax = (price * 18) / 100.0;
        double total = tax + price;

        System.out.println("Without tax: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Total Price: " + total);

    }
}
