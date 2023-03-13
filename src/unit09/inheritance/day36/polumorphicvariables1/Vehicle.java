package unit09.inheritance.day36.polumorphicvariables1;

public class Vehicle {
    private String color;


    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info(){

        System.out.println("The vehicle color is" + color);
        System.out.println(this.getClass().getSimpleName());
    }
}
