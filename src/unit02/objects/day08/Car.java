package unit02.objects.day08;

public class Car {
    private String color;
    private double mileage;

    public Car(String color, double mileage) {
        this.color = color;
        this.mileage = mileage;
    }

    public void drive(){
        mileage+=10;
    }
    public double getMileage(){
        return mileage;
    }
}
