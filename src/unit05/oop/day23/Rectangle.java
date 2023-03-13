package unit05.oop.day23;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Return the area
    public double getArea(){
        double area= width*height;
        return area;
    }
    public boolean getSquareorNot(){
        if (width==height){

            return true;

        }else{
            return false;
        }
//        You can make it
//        Return width == height;

    }
    public double getArea1(double width,double height){
        return width*height;
    }
    public void printInfo(){
        double width1 = width;
        double height1 = height;
        System.out.println("Square = "+getSquareorNot());
        System.out.println("height = "+ width1);
        System.out.println("widht =" + height1);
        System.out.println("area = "+getArea1(width1,height1));


    }

    /*Check if the rectangle is a square

     */
}
