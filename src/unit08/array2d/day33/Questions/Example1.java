package unit08.array2d.day33.Questions;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        String[][] words = {
                {"apple", "banana"},
                {"kiwi", "lemon", "lime"},
                {"strawberry", "coconut", "pineapple", "dragon fruit"}


        };
        System.out.println(search(words,"apple"));


    }

    public static boolean search(String[][] arr, String key) {

        String key1 = key;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals(key1)) {
                    found = true;
                    break;
                }
            }

        }
        return found;
    }
}



