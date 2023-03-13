package unit03.conditionals.day14;

import java.util.Scanner;

public class OrAndNotExamples {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a month");

        int month = scan.nextInt();
        if (month>=1 && month <=12){
            System.out.println(month + " Valid month entry");
        }else {
            System.out.println(month + " : Invalid month entry");
        }
    }
}
