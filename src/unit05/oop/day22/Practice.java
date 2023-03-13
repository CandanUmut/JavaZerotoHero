package unit05.oop.day22;

import java.util.Scanner;

public class Practice {
    // Ask user to enter 10 numbers
    // and print how many of those numbers
    // are greater than the number entered before it

    // user input : 5, 12, 45, 30, 38, 21, 15, 89, 50, 46
    // output : 4

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        int total=0;
        int previousNumber=0;
        for(int i =0; i<10; i++){

            int  nextNumber = scan.nextInt();
            if (nextNumber>previousNumber){
                total++;
            }
            previousNumber=nextNumber;
        }System.out.println(total-1);
    }
}
