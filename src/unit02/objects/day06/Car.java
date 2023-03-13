package unit02.objects.day06;

public class Car {
    private String color ;
    private double mileage;


    public Car(String carColor, double carMileage){
        color = carColor;
        mileage = carMileage;
        System.out.println(color + " "+ mileage);

    }

    public Car(String theColor){
        color = theColor;
        mileage =0 ;
        System.out.println(color+"  " + mileage);


    }

    public Car() {
        color ="Black";
        mileage = 0;
    }

    public void printCarInfo(){
        System.out.println("The car color is: " + color + " The mileage is: " + mileage);
    }


}
