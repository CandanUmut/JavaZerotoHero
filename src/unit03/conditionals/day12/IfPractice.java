package unit03.conditionals.day12;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many items you bought ?");
        int count = scan.nextInt();
        int item = 25;

        if (count> 5){
            System.out.println("The items price is " + ((item-1)*count));
    }
        if (count<= 5) {
            System.out.println("The items price is " + ((item) * count));
        }

    }
}
