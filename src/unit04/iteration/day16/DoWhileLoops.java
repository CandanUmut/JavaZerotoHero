package unit04.iteration.day16;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        String secretCode = "secret";
        String secretinput;
        do {
            System.out.println("Please enter your password");
            Scanner scan = new Scanner(System.in);
            secretinput = scan.nextLine();

        }while (!secretCode.equals(secretinput));
        System.out.println("Correct password");
    }
}
