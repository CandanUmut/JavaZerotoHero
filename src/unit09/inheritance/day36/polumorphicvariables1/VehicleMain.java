package unit09.inheritance.day36.polumorphicvariables1;

import java.util.ArrayList;
import java.util.Arrays;

public class VehicleMain {
    public static void main(String[] args) {



        ArrayList<Vehicle>vehicles= new ArrayList<>(Arrays.asList(new Car("Blue",5),(new Car("red",5))));

        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).info();

        }








    }

}
