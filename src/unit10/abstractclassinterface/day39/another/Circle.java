package unit10.abstractclassinterface.day39.another;

public class Circle extends Shape{

    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius *radius;
    }

    @Override
    public void draw() {
        System.out.println("The " + this.getClass().getSimpleName() + "is drawn at the coordinates of (" + getxCoordinate() + " , " +
                getyCoordinate() + ")" + " with the area of " + getArea());

    }

    public Circle(int xCoordinate, int yCoordinate, double radius) {
        super(xCoordinate, yCoordinate);
        this.radius = radius;
    }

}
