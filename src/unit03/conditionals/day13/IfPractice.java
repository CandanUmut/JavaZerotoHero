package unit03.conditionals.day13;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many hours youre leaving your car");
        int hour = input.nextInt();

        int parking2 = 30;
        int parkinghour = 12;
        if (hour <= 2){
            System.out.println("price is " + parking2 + " dollars");
        }else {
            System.out.println("price is " + hour*parkinghour +" dollars");
        }
    }
}
