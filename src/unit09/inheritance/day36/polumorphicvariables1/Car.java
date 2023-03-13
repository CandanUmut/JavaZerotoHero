package unit09.inheritance.day36.polumorphicvariables1;

public class Car extends Vehicle{
    private int numOfPassangers;

    public Car(String color, int numOfPassangers) {
        super(color);
        this.numOfPassangers = numOfPassangers;
    }


    public int getNumOfPassangers() {
        return numOfPassangers;
    }

    public void setNumOfPassangers(int numOfPassangers) {
        this.numOfPassangers = numOfPassangers;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("This is a nice car and have "+numOfPassangers+" passangers");
    }
}
