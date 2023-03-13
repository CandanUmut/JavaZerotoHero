package unit07.arraylist.day30.linearSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");
        Car car3 = new Car("Mazda");
        Car car4 = new Car("Cadillac");
        ArrayList<Car> cars =
                new ArrayList<>(Arrays.asList(car1,car2,car3,car4));
        System.out.println(findCar(cars,"Mazda"));







    }
    public static int findCar(ArrayList<Car> cars, String make){
        int a = -1;

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getMake().equals(make)) {
                a = cars.indexOf(cars.get(i));
            }

        }
        return a;
    }
    }

