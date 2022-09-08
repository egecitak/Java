import java.util.Scanner;

public class ActivityBasedOnTemp {

    public static void main(String[] args) {

        int temp;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature: ");
        temp = input.nextInt();

        if (temp < 5 ) {
            System.out.println("Go skiing.");
        } else if (temp >= 5 && temp < 10) {
            System.out.println("Go to a cinema.");
        } else if (temp >= 10 && temp < 15) {
            System.out.println("Go to a cinema or picnic.");
        } else if (temp >= 15 && temp < 25) {
            System.out.println("Go to a picnic.");
        } else if (temp >= 25) {
            System.out.println("Go swimming.");
        }

    }
}
