package unit07.arraylist.day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaxMinMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,51,23,12,123,1));

        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        System.out.println("sort");
        Collections.sort(numbers);
        System.out.println("Reverse");
        Collections.reverse(numbers);

        System.out.println("reverse again");
        Collections.reverse(numbers);
        System.out.println("binary search");

        System.out.println(Collections.binarySearch(numbers,51));

    }
}
