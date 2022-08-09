import java.util.Scanner;

public class GroceryRegister {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PEAR = 2.14;
        final double APPLE = 3.67;
        final double TOMATO = 1.11;
        final double BANANA = 0.95;
        final double EGGPLANT = 5.00;

        System.out.print("Weight of pears: ");
        int pearW = input.nextInt();
        System.out.print("Weight of apples: ");
        int appleW = input.nextInt();
        System.out.print("Weight of tomatoes: ");
        int tomatoW = input.nextInt();
        System.out.print("Weight of bananas: ");
        int bananaW = input.nextInt();
        System.out.print("Weight of eggplants: ");
        int eggplantW = input.nextInt();

        double total = (PEAR * pearW) + (APPLE * appleW) + (TOMATO * tomatoW) + (BANANA * bananaW) + (EGGPLANT * eggplantW);

        System.out.println("Total price: " + total + " TL");
    }
}
