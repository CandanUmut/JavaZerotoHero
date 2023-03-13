package unit02.objects.day07;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,10);
//        rectangle1.printArea();

        Rectangle rectangle2 = new Rectangle(5,2);
        double area1 = rectangle1.getArea();
        double area2= rectangle2.getArea();
        System.out.println("The total area of rectangle");
        System.out.println(area1+area2);
    }

}
