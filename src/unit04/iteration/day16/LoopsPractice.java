package unit04.iteration.day16;

import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {

        int requiredYears = getYearsToReach(0,0,0);

//        double account = 100;
//        int goal =10000;
//        int year = 0;
//
//        while(account<=goal){
//
//            account=account + account*0.3;
//            year++;
//            System.out.println(year + " year passed and you have $"+ account);
//
//        }
//        System.out.println(year + " year passed and you have $"+ account);


    }
    public static int getYearsToReach(double balance, double rate, int goal){
        int years = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your balance");
        balance= scan.nextDouble();
        System.out.println("What's the rate of the bank");
        rate = scan.nextDouble();
        System.out.println("Whats your goal to reach?? ");
        goal = scan.nextInt();
        while(balance <=goal){
            balance = balance + balance*rate;
            years++;
            System.out.println(years + " year passed and you have $" +balance);

        }
        return years;



    }
}
