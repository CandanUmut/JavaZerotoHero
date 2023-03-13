package unit03.conditionals.day12;

import java.util.Scanner;

public class BooleanPractice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you ?");
        int age = scan.nextInt();
        boolean is18orAbove;
        is18orAbove = age >=18;
        System.out.println("Can go to party = " +is18orAbove);

    }
}
