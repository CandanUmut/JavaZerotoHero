package unit09.inheritance.day34.carInheritance;

public class Car {
    private String make;
    private double price;


    public Car() {
        make= "Will be updated";

    }

    public Car(String make, double price) {
        this.make = make;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
