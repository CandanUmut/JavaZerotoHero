package unit11.collections.day43;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortIntegerList {
    public static void main(String[] args) {
        List<Integer>integerlisr= new ArrayList<>(List.of(21,45,646,46,46,46,856));

        integerlisr.sort(Comparator.naturalOrder());
        System.out.println("Sorted bt Natural order");
        System.out.println(integerlisr);
        integerlisr.sort(Comparator.reverseOrder());
        System.out.println("Sorted by reverse order");
        System.out.println(integerlisr);
    }
}
