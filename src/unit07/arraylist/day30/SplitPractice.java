package unit07.arraylist.day30;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        /*Get a String and turn the first letters of each word into a uppercase letter and print them
        on the screen
         */

        String sentence ="SDET stands for Software Development Engineer in Test";
        String sentence1= "Java is a object oriented programming language";

        String[]words = sentence1.split(" ");
        System.out.println(Arrays.toString(words));
        int count = 0;
        for (String word:words
        ) {
            System.out.println(word.substring(0,1).toUpperCase()+word.substring(1));
            count++;

        }
        System.out.println(count);

    }
    }

