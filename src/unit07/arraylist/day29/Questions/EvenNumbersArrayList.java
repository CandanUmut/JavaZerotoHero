package unit07.arraylist.day29.Questions;

import java.util.ArrayList;

public class EvenNumbersArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = evenNumbers(100);
        System.out.println(numbers);
        evenNumbers(100);
        System.out.println(evenNumbers(100));
        System.out.println(oddNumbers(100));

    }
    public static ArrayList<Integer> evenNumbers(int a) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
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

}
