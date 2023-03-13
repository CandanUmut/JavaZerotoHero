package unit11.collections.day41.listInterface;

import unit10.abstractclassinterface.day40.example.A;

import java.util.*;

public class OfMethodUsage {
    public static void main(String[] args) {
        List<String>words = List.of("Hey", "Hi", "How are you? ");

        List<String> wordsArrayList= new ArrayList<>(words);

        wordsArrayList.add("Umut");
        System.out.println(wordsArrayList);


        System.out.println(words);

        List<String> strings = new ArrayList<>();
        strings = new LinkedList<>(words);
        strings = new Stack<>();
        strings = new Vector<>(words);



    }
}
