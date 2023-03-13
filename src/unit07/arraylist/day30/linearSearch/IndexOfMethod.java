package unit07.arraylist.day30.linearSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,66,1,9,23,14,12));

        System.out.println(numbers.indexOf(9));
        System.out.println(numbers.get(8));

        ArrayList<String > countries = new ArrayList<>(Arrays.asList("Morocco", "USA", "Turkey","Mexico"));

        System.out.println(countries.indexOf("USA"));
        System.out.println(countries.indexOf("Mexico"));
        System.out.println(countries.indexOf("England"));
        System.out.println(countries.get(3));
    }
}
