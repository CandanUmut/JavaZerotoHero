package unit03.conditionals.day15;

import java.util.Objects;

public class EqualsMethod {
    private int width;
    private int height;

    public EqualsMethod(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsMethod that = (EqualsMethod) o;
        return width == that.width && height == that.height;
    }


}
