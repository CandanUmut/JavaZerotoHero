package unit07.arraylist.day29.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateOdds {
    public static void main(String[] args) {
        /*
        add a duplicate element if the element is an odd number
         */

        ArrayList<Integer>numbers = new ArrayList<>(Arrays.asList(2,4,6,9,10,11,28));

        for (int i = numbers.size()-1; i >= 0; i--) {
            if(numbers.get(i)%2==1){
                numbers.add(i,numbers.get(i));


            }

        }
        System.out.println(numbers);

    }
}
