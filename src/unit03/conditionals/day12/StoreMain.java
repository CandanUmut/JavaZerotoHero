package unit03.conditionals.day12;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Store today = new Store();
        Scanner input = new Scanner(System.in);
        System.out.println("How many items you bought ? ");
        int quantity = input.nextInt();

        int total = today.getTotalPrice(quantity);
        System.out.println("Total is: "+ total);

    }
}
