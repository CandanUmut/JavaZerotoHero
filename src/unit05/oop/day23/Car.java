package unit05.oop.day23;

public class Car {
    private String model;
    private double mileage;
    private int year;
    private static int numberOfCars=0;
    private static int numOfToyota=0;


    public Car(String model, double mileage, int year) {
        this.model = model;
        this.mileage = mileage;
        this.year = year;

        numberOfCars++;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mileage=" + mileage +
                ", year=" + year +
                '}';
    }
}
