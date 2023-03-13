package unit03.conditionals.day13;

import java.util.Scanner;

public class ElseIfpracticee {
    public static void main(String[] args) {
        System.out.println("Whats your score");
        int grade = new Scanner(System.in).nextInt();

        if (grade >89){
            System.out.println("your grade is A");
        }else if(grade>79){
            System.out.println("your grade is B");
        }else if(grade>69){
            System.out.println("your grade is C");
        }else{
            System.out.println("Your grade is F");
        }
    }


}
