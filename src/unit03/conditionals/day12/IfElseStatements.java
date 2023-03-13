package unit03.conditionals.day12;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you ? ? ");
        int age =input.nextInt();





        if(age> 16){
            System.out.println("You're old enough to drive");

        }else {
            System.out.println("You are not old enough to drive");
        }
    }
}
