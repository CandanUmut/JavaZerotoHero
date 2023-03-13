package unit05.oop.day20.noreason;

public class House {
    private String Color;
    private  String Address;
    private int price;
    private boolean isRental;


    public House(String color, String address, int price, boolean isRental) {
        Color = color;
        Address = address;
        this.price = price;
        this.isRental = isRental;
    }

    public House(){
        Color="Blue";
        Address="240 Miller";
        price = 300000;
        isRental=false;

    }

    @Override
    public String toString() {
        return "House{" +
                "Color='" + Color + '\'' +
                ", Address='" + Address + '\'' +
                ", price=" + price +
                ", isRental=" + isRental +
                '}';
    }
}
