package unit03.conditionals.day13;

import java.util.Scanner;

public class ClassStart {
    /*
    If there are 50 or more students class starts
    else you talk about world cup

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many students in the class");
        int student = scan.nextInt();
        if (student>50){
            System.out.println("Class started");
        }else{
            System.out.println("Talk about world cup");
        }

    }
}
