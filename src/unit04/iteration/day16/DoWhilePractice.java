package unit04.iteration.day16;

import java.util.Scanner;

public class DoWhilePractice {
    public static void main(String[] args) {
        int luckynumber = 15;
        int inputnumber;
        do{
            System.out.println("Whats the lucky number");
            Scanner scan = new Scanner(System.in);
            inputnumber=scan.nextInt();


        }while(luckynumber!=inputnumber);

        System.out.println("Congrats");
    }
}
