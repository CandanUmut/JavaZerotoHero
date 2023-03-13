package unit07.arraylist.day28.ArrayListMethods;

import java.util.ArrayList;

public class ArraylistExamples {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = evenNumbers(1001);
        System.out.println(numbers);
        evenNumbers(100);
        System.out.println(evenNumbers(100));

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
        }


