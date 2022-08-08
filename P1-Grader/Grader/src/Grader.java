import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {

        int math, phys, chem, turk, hist, mus;

        Scanner input = new Scanner(System.in);

        //User input
        System.out.print("Enter math grade: ");
        math = input.nextInt();

        System.out.print("Enter phys grade: ");
        phys = input.nextInt();

        System.out.print("Enter chem grade: ");
        chem = input.nextInt();

        System.out.print("Enter turk grade: ");
        turk = input.nextInt();

        System.out.print("Enter hist grade: ");
        hist = input.nextInt();

        System.out.print("Enter mus grade: ");
        mus = input.nextInt();

        double avg = (math + phys + chem + turk + hist + mus) / 6.0;
        System.out.println("Your average: " + avg);

        String result;

        result = (avg >= 60) ? "Pass" : "Fail";
        System.out.println(result);

    }
}
