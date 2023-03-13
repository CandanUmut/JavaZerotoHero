package unit07.arraylist.day29.Questions;

import java.util.ArrayList;

public class CreateAnArray {

    public static void main(String[] args) {
        ArrayList<Integer> allNumbers = new ArrayList<>();
        allNumbers.addAll(oddNumbers(100));
        allNumbers.addAll(evenNumbers(100));
        System.out.println(allNumbers);
        allNumbers.removeAll(evenNumbers(100));
        System.out.println(allNumbers);

    }
    public static ArrayList<Integer> oddNumbers(int a) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 1) {
                oddNumbers.add(i);
            }
        }
        return oddNumbers;
    }
    public static ArrayList<Integer> evenNumbers(int a) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                oddNumbers.add(i);
            }
        }
        return oddNumbers;
    }
}
