package unit11.collections.day45.TreeSetexample;

import unit06.array.day23.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
        String str ="this is a nice day in a nice way on a good day";
        String[]words = str.split(" ");

        System.out.println(Arrays.toString(words));

        Set<String> distincWords = new HashSet<>(Arrays.asList(words));

        System.out.println(distincWords);

        Set<String>distinctWordsByOrder = new TreeSet<>(Arrays.asList(words));
        System.out.println(distinctWordsByOrder);
    }
}
