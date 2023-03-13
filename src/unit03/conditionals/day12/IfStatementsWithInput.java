package unit03.conditionals.day12;

import java.util.Scanner;

public class IfStatementsWithInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many steps did you have today  ?");
        int stepsgoal = scan.nextInt();
        if(stepsgoal>=7500){
            System.out.println("You just reached your goal. Congrats. ");
        }
}
}
