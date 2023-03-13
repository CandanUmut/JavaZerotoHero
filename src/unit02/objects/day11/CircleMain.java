package unit02.objects.day11;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        double area;
        area = circle1.getArea();
        System.out.println("The Area is = " + area);
        System.out.println("The Perimeter is = " + circle1.getPerimeter());
    }
}
