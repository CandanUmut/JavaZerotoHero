package unit07.arraylist.day29.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class AddTwoAllValues {
        public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));


            ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6,71));


            ArrayList<Integer> list3 = new ArrayList<>();

            // Sum the indices of the two lists and save the result in list3
            for (int i = 0; i < list1.size(); i++) {
                int sum = list1.get(i) + list2.get(i);
                list3.add(sum);
            }

            System.out.println(list3); // prints [5, 7, 9]
        }
    }


