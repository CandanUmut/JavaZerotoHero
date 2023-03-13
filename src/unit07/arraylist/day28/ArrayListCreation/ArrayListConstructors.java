package unit07.arraylist.day28.ArrayListCreation;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConstructors {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); numbers.add(20); numbers.add(30);
        System.out.println("numbers :" + numbers);
        ArrayList<Integer> numbers2 = new ArrayList<>(numbers);
        System.out.println(numbers2);
        // Arrays.aslist() method returns a collection //
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(100,200,300,400));
        System.out.println(numbers3);


    }
}
