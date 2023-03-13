package unit07.arraylist.day29;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchIntegers {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>(Arrays.asList(1,2,3,45,6,7));
        System.out.println(returnIndex(numbers,7));



    }

    public static int returnIndex(ArrayList<Integer>Arr, int key) {

        int a = -1;
        for (int i = 0; i < Arr.size(); i++) {
            if (Arr.get(i) == key) {
                a = Arr.indexOf(Arr.get(i));
            }

        }
        return a;
    }
}
