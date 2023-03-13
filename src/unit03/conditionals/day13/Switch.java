package unit03.conditionals.day13;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please make a choice" +
                " Menu 1 = Pizza" +
                " Menu 2 = Hamburger" +
                " Menu 3 = Fried Chicken" +
                " For the special you can enter whatever you want");
        int menu = scan.nextInt();

        switch (menu){
            case 1:
                System.out.println("You ordered pizza");
                break;
            case 2:
                System.out.println("You ordered hamburger");
                break;
            case 3:
                System.out.println("You ordered Fried Chicken");
                break;


            default:
                System.out.println("You ordered the specials");
        }
    }
}
