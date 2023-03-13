package unit09.inheritance.day37.car;

public class Car extends Vehicle {
    private int numofPassangers;

    public Car(String color, int numofPassangers) {
        super(color);
        this.numofPassangers = numofPassangers;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("This is a nice car and have "+numofPassangers+" passangers");
    }

    public int getNumofPassangers() {
        return numofPassangers;
    }

    public void setNumofPassangers(int numofPassangers) {
        this.numofPassangers = numofPassangers;
    }
}
