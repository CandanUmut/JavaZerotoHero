package unit09.inheritance.day37.car;



import java.util.ArrayList;
import java.util.List;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car(" Yellow",2);
//        car.info();
        Vehicle anothervehicle = new Vehicle("Blue");
        ArrayList<Vehicle>vehicles = new ArrayList<>(List.of(new Vehicle("Yellow"), new Car("Red", 7), car,new Car("Green", 4), anothervehicle));
        Integer a = 5;
        Integer b = 7;
        List.of(a,b);
        List.of(5,7);

        Vehicle vehicleA= new Vehicle("Blue");
        List.of(new Vehicle("Blue"), new Vehicle("Yellow"));

        for (Vehicle vehicle:vehicles
             ) {
            vehicle.info();

        }




    }
}
