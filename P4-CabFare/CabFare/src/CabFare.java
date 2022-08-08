import java.util.Scanner;

public class CabFare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How far away is your destination in kms?");
        double distance = input.nextDouble();

        double fare = ((distance * 2.20) + 10 < 20) ? 20 : ((distance * 2.20) + 10);
        System.out.println("Your fare: " + fare);
    }
}
