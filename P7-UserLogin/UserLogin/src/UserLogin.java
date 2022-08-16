import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String decision = "";
        System.out.print("Please enter your username: ");
        String userName = input.nextLine();
        System.out.print("Please enter your password: ");
        String oldPassword = "123";
        String password = input.nextLine();
        String newPassword = "";
        if (userName.equals("java") && password.equals("123")) {
            System.out.println("Entry is succesful.");
            return;
        }
        else if (password.equals("123")) {
            System.out.println("Wrong user name");
        }
        else if (userName.equals("java")) {
            System.out.print("Your password is wrong. Do you want to reset your password? (y/n): ");
            decision = input.nextLine();
        }
        if (decision.equals("n")) {
            System.out.println("Try again.");
        } else if (decision.equals("y")) {
            System.out.print("Please enter your new password which can't be same with the previous password: ");
            newPassword = input.nextLine();
        }
        while (newPassword.equals(oldPassword)) {
            System.out.print("You can't use your previous password. Please enter a new password: ");
            newPassword = input.nextLine();
        }
        System.out.println("New password is set.");
    }
}
