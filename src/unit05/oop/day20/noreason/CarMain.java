package unit05.oop.day20.noreason;

import unit05.oop.day20.noreason.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car1= new Car();
        System.out.println(car1);
        Car car2= new Car("Yellow",2010,10000);
        System.out.println(car2);
    }
}
