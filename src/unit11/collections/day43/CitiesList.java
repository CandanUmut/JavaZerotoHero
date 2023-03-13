package unit11.collections.day43;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CitiesList {
    public static void main(String[] args) {
        List<String>cities = new ArrayList<>(List.of("Corum","Istanbul","Izmir"));
        System.out.println(cities);

        cities.sort(Comparator.naturalOrder());
        System.out.println("Sorted bt Natural order");
        System.out.println(cities);
        cities.sort(Comparator.reverseOrder());
        System.out.println("Sorted by reverse order");
        System.out.println(cities);


    }

}
