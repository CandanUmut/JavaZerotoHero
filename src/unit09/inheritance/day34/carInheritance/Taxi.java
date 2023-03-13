package unit09.inheritance.day34.carInheritance;

public class Taxi extends Car{
  /*Create a taxi class extended from the car class
    add int numberOfPassengers instance variable
    Create a constructor using
    the super() constructor with parameters from the superclass.*/

    private int numOfPassangers;

    public Taxi(String make, double price, int numOfPassangers) {
        super(make, price);
        this.numOfPassangers = numOfPassangers;
    }

    public int getNumOfPassangers() {
        return numOfPassangers;
    }
}
