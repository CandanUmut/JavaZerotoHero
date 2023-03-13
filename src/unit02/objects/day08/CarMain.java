package unit02.objects.day08;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Red", 150);
        car1.drive();
        System.out.println(car1.getMileage());
    }


}
