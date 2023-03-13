package unit02.objects.day08;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle(3, 2);
        //assign to a variable and write the function
        int area = rectangle1.getArea();
        System.out.println("The returned area is "+area);
    }
}
