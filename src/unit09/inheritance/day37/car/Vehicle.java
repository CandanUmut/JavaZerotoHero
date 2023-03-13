package unit09.inheritance.day37.car;

public class Vehicle {
    private String color;

    public Vehicle(String color) {
        this.color = color;
    }

    public void info(){
        System.out.println(this.getClass().getSimpleName() + " is " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
