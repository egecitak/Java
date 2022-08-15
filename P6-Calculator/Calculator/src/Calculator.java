import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        //nextInt leaves the new line character
        input.nextLine();

        System.out.print("Choose the operation (+, -, /, *): ");
        String op = input.nextLine();

        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 != 0)
                {
                    System.out.println((double) num1 / num2);
                } else {
                    System.out.println("Division by zero");
                }
                break;
            default:
                System.out.println("Choose a correct operation");
        }
    }
}
