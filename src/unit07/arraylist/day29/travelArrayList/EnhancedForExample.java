package unit07.arraylist.day29.travelArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class EnhancedForExample {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,89,10));


        for (int number:numbers
             ) {
            System.out.print(number+"   ");

        }
    }
}
