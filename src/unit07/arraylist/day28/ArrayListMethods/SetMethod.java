package unit07.arraylist.day28.ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul" , "Tokyo","London", " Ankara"));
        cities.set(0,"Trabzon");
        System.out.println(cities);

        // Remove Method
        cities.remove(1);
        System.out.println("Removed element :" + cities.remove(0));
        System.out.println(cities);

        cities.remove("London");
        System.out.println(cities);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,33));
        System.out.println("numbers : " + numbers);

        numbers.remove(0);
        System.out.println(numbers);

        numbers.remove(Integer.valueOf(33));
        System.out.println(numbers);

        numbers.removeAll(Arrays.asList(2,3,5,11,19));
        System.out.println(numbers);




    }
}
