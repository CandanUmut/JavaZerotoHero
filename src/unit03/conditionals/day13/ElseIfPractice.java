package unit03.conditionals.day13;

import java.util.Scanner;

public class ElseIfPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number please");

        int number = input.nextInt();

        if(number>0){
            System.out.println("Its a positive number");
        } else if (number<0) {
            System.out.println("its a negative number");

        }else{
            System.out.println("its 0");
        }
    }
}
