package unit09.inheritance.day38.objectClass;

import java.util.Objects;

public class SportShoe extends Shoe{
    private String name;

    public SportShoe(int shoeSize, String color, String name) {
        super(shoeSize, color);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportShoe sportShoe = (SportShoe) o;
        return name.equals(sportShoe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
