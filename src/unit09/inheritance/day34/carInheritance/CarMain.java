package unit09.inheritance.day34.carInheritance;

public class CarMain {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("Mercedes",99999,6);
        System.out.println("the taxi is " + taxi.getMake() + " with " + taxi.getNumOfPassangers() + " seats ");


    }
}
