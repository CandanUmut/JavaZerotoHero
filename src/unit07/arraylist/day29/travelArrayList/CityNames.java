package unit07.arraylist.day29.travelArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CityNames {
    public static void main(String[] args) {
        ArrayList<String> travelledCities = new ArrayList<>(Arrays.asList("Istanbul "," Trabzon ", " New York", " Berlin"));

        for (int i = 0; i < travelledCities.size(); i++) {
            System.out.print(travelledCities.get(i));

        }
    }
}
