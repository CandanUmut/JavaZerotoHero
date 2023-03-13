package unit07.arraylist.day28.ArrayListCreation;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateWithArraysMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,66,123,4123,1));
        System.out.println("numbers : "+numbers);
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);numbers2.add(20);numbers2.add(30);
        System.out.println("numbers2 : "+numbers2);
        ArrayList<Integer>numbers3= new ArrayList<>(numbers2);
        numbers3.add(30);
        System.out.println("numbers3: "+numbers3);
    }
}
