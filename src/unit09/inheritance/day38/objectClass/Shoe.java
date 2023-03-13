package unit09.inheritance.day38.objectClass;

import java.util.Objects;

public class Shoe {
    private int shoeSize;
    private String color;

    public Shoe(int shoeSize, String color) {
        this.shoeSize = shoeSize;
        this.color = color;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shoe shoe = (Shoe) o;
        return shoeSize == shoe.shoeSize && color.equals(shoe.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shoeSize, color);
    }
}
