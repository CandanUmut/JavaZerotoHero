package unit05.oop.day20.noreason;

public class Car {
    private  String color;
    private  int year;
    private double mileage;


    public Car(){
        color ="Black";
        year = 2022;
        mileage = 0.0;

    }

    public Car(String color, int year, double mileage) {
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
