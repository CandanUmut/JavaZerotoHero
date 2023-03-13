package unit02.objects.day11;

public class Circle {
    private double Radius;

    public Circle(double radius) {
        Radius = radius;
    }

    public double getArea(){
        return  Math.PI*Math.pow(Radius,2);
    }
    public double getPerimeter(){
        return 2 * Math.PI * Radius;
    }

}
