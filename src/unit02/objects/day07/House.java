package unit02.objects.day07;

public class House {
    private String color;
    private String address;

    public House(String color, String address) {
        this.color = color;
        this.address = address;
    }
    public void changeColor(String newColor){
        System.out.println(color);
        color = newColor;
        System.out.println("The color of the house is " + color );


    }
}
