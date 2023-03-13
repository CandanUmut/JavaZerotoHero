package unit07.arraylist.day29.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0,1,1,2,3,4,100, 200, 123, 123, 4123, 5));

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%2 ==0){
                numbers.remove(i);
                i--;


        }
        }
        System.out.println(numbers);

    }
}

