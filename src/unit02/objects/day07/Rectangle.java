package unit02.objects.day07;

public class Rectangle {
    private double height;
    private double widht;

    public Rectangle(double height, double widht) {
        this.height = height;
        this.widht = widht;
    }
    public void printArea(){
        System.out.println("The area is " + (height*widht));
    }

    public double getArea(){
        double area = widht * height;
        return area;
    }
}
