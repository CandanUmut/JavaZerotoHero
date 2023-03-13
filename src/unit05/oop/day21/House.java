package unit05.oop.day21;

public class House {
    private String color;
    private String address;
    private int price;

    public House(String color, String address, int price) {
        this.color = color;
        this.address = address;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getAddress() {
        return address;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                '}';
    }
}
