package unit07.arraylist.day28.ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexOfMethodContains {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello" , "Hi","bye", " Why"));
        System.out.println(words.indexOf("Hi"));

        ArrayList<Integer>numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,78,9,10));
        System.out.println(numbers);
        System.out.println(numbers.contains(2));
        System.out.println(numbers.indexOf(5));
        System.out.println(words.indexOf("Istanbul"));
        System.out.println(words.contains("l"));
        System.out.println(words.isEmpty());

    }
}
