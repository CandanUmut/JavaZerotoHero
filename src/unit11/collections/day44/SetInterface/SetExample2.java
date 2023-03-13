package unit11.collections.day44.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        Set<String>StringSet = new HashSet<>();
        System.out.println(StringSet.add("Umut"));
        System.out.println(StringSet.add("Candan"));

        System.out.println(StringSet);
    }
}
