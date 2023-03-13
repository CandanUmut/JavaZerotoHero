package unit04.iteration.day18;

import java.util.Random;
import java.util.Scanner;

public class NewQuestion {
    public static void main(String[] args) {
        Random number = new Random();
        int number1 = number.nextInt(1,100);

        Scanner scan = new Scanner(System.in);

        int attemps=10;


        int a = 0;
        while(a<10){
            System.out.println("Please guess a number you have "+ attemps+" attemps");
            int number2 = scan.nextInt();
            if (number2>number1){
                System.out.println("Too high");



            } else if (number2<number1) {
                System.out.println("Too low");

            }else {
                System.out.println("You've found the number congratulations");
            }
            a++;
            attemps--;

        }



    }
}
