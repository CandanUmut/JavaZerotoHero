package unit07.arraylist.day28.ArrayListCreation;

import java.util.ArrayList;
import java.util.Arrays;

public class AddMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        System.out.println(numbers);
        numbers.add(20);
        System.out.println(numbers);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        numbers.add(0,0);
        System.out.println(numbers);


        ArrayList<Integer>numbers2= new ArrayList<>();
        numbers2.add(-10);
        numbers2.add(-20);
        numbers2.add(-30);
        System.out.println(numbers2);
        numbers.addAll(numbers2);
        System.out.println(numbers);
        numbers.addAll(3,numbers2);
        System.out.println(numbers);

        numbers.clear();

        ArrayList<Integer> numbers3= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers3);
    }
}
