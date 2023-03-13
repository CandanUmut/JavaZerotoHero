package unit03.conditionals.day13;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
        //drinks
        //one drink is 3 dollars
        //if you buy 5 or more 2.5 dollars per drink
        //print out the final price
        Scanner scan = new Scanner(System.in);

        System.out.println("How many drinks you gonna have ? ");
        int drinksay= scan.nextInt();

        int drink = 3;
        double morethan5 = 2.5;

        if (drinksay < 5){
            System.out.println("Price is " +drink * drinksay);

        } else{
            System.out.println("Price is " + morethan5*drinksay);

        }

    }
}
