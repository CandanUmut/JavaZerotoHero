package unit11.collections.day43.sortinglistComperable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(190, "Honda"));
        cars.add(new Car(178, "Hyundai"));
        cars.add(new Car(180, "BMW"));
        cars.add(new Car(195, "Mercedes"));
        cars.add(new Car(190, "Honda"));
        cars.add(new Car(190, "Honda"));
        System.out.println(cars);
        cars.sort(Comparator.naturalOrder());
        System.out.println("Natural order");
        System.out.println(cars);
        cars.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order");
        System.out.println(cars);
    }
}
