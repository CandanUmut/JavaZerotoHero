package unit07.arraylist.day30;

import java.util.Arrays;

public class SplitMethodExample {
    public static void main(String[] args) {
        String sentence ="SDET stands for Software Development Engineer in Test";
        String sentence1= "Testing and development goes hand by hand";

        String[]words = sentence1.split(" ");
        System.out.println(Arrays.toString(words));
        int count = 0;
        for (String word:words
             ) {
            System.out.println(word.toUpperCase());
            count++;

        }
        System.out.println(count);

    }
}
