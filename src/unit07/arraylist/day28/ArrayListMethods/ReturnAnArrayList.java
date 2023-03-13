package unit07.arraylist.day28.ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnAnArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = returnArrayList();
        System.out.println(cityList);

    }

    public static ArrayList<String> returnArrayList(){
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul", "Izmir", "Ankara"));

        return cities;


    }
}
