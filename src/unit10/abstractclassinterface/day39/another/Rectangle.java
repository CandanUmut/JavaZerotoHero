package unit10.abstractclassinterface.day39.another;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(int xCoordinate, int yCoordinate, double width, double height) {
        super(xCoordinate, yCoordinate);
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public void draw() {
        System.out.println("The area is " + getArea() + " the x coordinates are " + getxCoordinate() + " the y coordinates are " + getyCoordinate());

    }
}
