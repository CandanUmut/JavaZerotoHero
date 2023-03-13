package unit07.arraylist.day31;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[]numbers ={-34,23,45,3245,123,4123,4123,5123,523,123,5};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,5));
        System.out.println("Dont run binary search on unsorted arrays");


        String []words = {"asd","gh","fasd","sadad","idajs","omomeriq"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
