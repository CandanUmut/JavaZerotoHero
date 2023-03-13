package unit07.arraylist.day29;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachNoAddRemove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(100,200,300,40));

        for (int number: numbers
             ) {
            /*IT will throw an exception error
            numbers.add(10);

             */
            }

        }
    }

