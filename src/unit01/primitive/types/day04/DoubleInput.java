package unit01.primitive.types.day04;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your GPA : ");
        double gpa ;
        gpa = input.nextDouble();
        System.out.println("Congrats you have a good Gpa which is");
        System.out.println(gpa);
        System.out.println("What is your favorite PL");
        String programminglang ;
        input.nextLine(); // this is called next line buffer
        programminglang = input.nextLine();
        System.out.println("Your favorite language is ");
        System.out.println(programminglang);


    }
}
