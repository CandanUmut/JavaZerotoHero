package unit02.objects.day08;
// variables
public class Rectangle {
    private int widht;
    private int height;
// constructor
    public Rectangle(int widht, int height) {
        this.widht = widht;
        this.height = height;
    }
    //nonvoid getArea method
    public int getArea(){
        //calculate the area and assign it to an integer and than return it to the area
        int area = widht * height;
        return area;

    }
}
