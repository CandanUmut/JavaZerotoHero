package unit05.oop.day21;

public class Car {
    private String color;
    private int year;
    private int mileage;

    public Car(String color, int year, int mileage) {
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }
    @Override
    public String toString(){
        return "It is "+color+" mileage"+mileage+"year"+year;
    }

}
