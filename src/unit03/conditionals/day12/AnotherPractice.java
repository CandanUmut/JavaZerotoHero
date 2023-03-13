package unit03.conditionals.day12;

import java.util.Scanner;

public class AnotherPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many steps did you have today  ?");
        int stepsgoal = scan.nextInt();
        boolean is7500orAbove;
        is7500orAbove = stepsgoal>= 7500 ;
        System.out.println("You reached your goal " + is7500orAbove);

}
}
