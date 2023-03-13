package unit01.primitive.types.day05;

import java.util.Scanner;

public class pizzaOrder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name ?");
        String name = scan.nextLine();



        System.out.println("What's the course name ?");
        String course= scan.nextLine();

//        System.out.println(course);
        System.out.println("Enter first exam's result: ");
        double exam1 = scan.nextInt();
//        System.out.println(exam1);

        System.out.println("Enter second exam's result: ");
        double exam2 = scan.nextInt();
//        System.out.println(exam2);

        double average;
        average = (exam1 + exam2)/2 ;
        System.out.print(name +" has the average from  " + course + "  " + average);


    }
}
