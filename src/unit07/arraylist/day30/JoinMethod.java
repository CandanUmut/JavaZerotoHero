package unit07.arraylist.day30;

import java.util.Arrays;

public class JoinMethod {
    public static void main(String[] args) {
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
        String updatedSentence = String.join(" ",words);
        System.out.println("Updated sentence: \n" + updatedSentence);

        String[]somewords= {"Hello","World","Of","Java"};
        String joinedWords= String.join("-",somewords);
        System.out.println(joinedWords);

    }
    }


