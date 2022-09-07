import java.util.Scanner;


public class ClassGrader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, phys, turk, chem, mus, count = 0;

        System.out.print("Please enter your math grade: ");
        math = input.nextInt();
        if (math < 0 || math > 100)
            math = 0;
        else
            count++;

        System.out.print("Please enter your physics grade: ");
        phys = input.nextInt();
        if (phys < 0 || phys > 100)
            phys = 0;
        else
            count++;

        System.out.print("Please enter your Turkish grade: ");
        turk = input.nextInt();
        if (turk < 0 || turk > 100)
            turk = 0;
        else
            count++;

        System.out.print("Please enter your chemistry grade: ");
        chem = input.nextInt();
        if (chem < 0 || chem > 100)
            chem = 0;
        else
            count++;

        System.out.print("Please enter your music grade: ");
        mus = input.nextInt();
        if (mus < 0 || mus > 100)
            mus = 0;
        else
            count++;

        if (count != 0) {
            double avg = (math + phys + turk + chem + mus) / count;
            if (avg >= 55)
                System.out.println("You passed");
            else
                System.out.println("You failed");
        }
        else
            System.out.println("Please enter values between 0-100");

    }
}
