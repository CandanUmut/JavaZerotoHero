package unit07.arraylist.day28.ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class SizeMethod {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello" , "Hi","bye", " Why"));
        System.out.println(words.size());
        System.out.println(words.get(words.size()-1));

    }


}
