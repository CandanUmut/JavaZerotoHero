package unit03.conditionals.day15;

import java.util.Scanner;

public class MethodImportantVotingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats Your age");
        int age = scan.nextInt();
        System.out.println("Did you register to vote (true or false) ");
        boolean isRegistered = scan.nextBoolean();
        boolean readyTovote = canVote(age,isRegistered);
        System.out.println("Can vote " + readyTovote);

        if(canVote(age,isRegistered)){
            System.out.println("Can Vote ");
        }else {
            System.out.println("You cannot vote bro");
        }


    }

    public static boolean canVote(int age, boolean isRegistered){


        if(age >=18 && isRegistered){
            return true;

        }else {
            return false;
        }
//        return age>=18 &&isRegistered;
//        if(age >=18 && isRegistered)
//            return true;
//        return false;

//         another way to use return !! when it comes to return on a methodand if its triggered  it will take the value and stop!
    }
}
