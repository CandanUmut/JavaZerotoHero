package unit07.arraylist.day28.ArrayListCreation;

import unit06.array.day23.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListString {
    public static void main(String[] args) {
        String[] wordArray = {"a","an","on"};
        ArrayList<String> names= new ArrayList<>(Arrays.asList(wordArray));
        System.out.println(names);

        ArrayList<String> cities = new ArrayList<>(List.of("Trabzon", "New York", "Istanbul"));
        System.out.println(cities);


    }

}
