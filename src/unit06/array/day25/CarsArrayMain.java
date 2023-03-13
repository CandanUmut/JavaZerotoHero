package unit06.array.day25;

public class CarsArrayMain {
    public static void main(String[] args) {
        Car car1=new Car(140);
        Car car2= new Car(1999);
        Car car3=new Car(90901);
        Car car4=new Car(49999);

        Car[]cars={car1,car2,car3,car4};

        for(Car car : cars){
            if(car.getMileage()<50000){
                System.out.println(car);
            }

        }

    }
}

