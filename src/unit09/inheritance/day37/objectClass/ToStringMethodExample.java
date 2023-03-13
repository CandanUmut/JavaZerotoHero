package unit09.inheritance.day37.objectClass;

import java.util.Objects;

public class ToStringMethodExample {
    private String SomeWOrds;

    public ToStringMethodExample(String someWOrds) {
        SomeWOrds = someWOrds;
    }

    @Override
    public String toString() {
        return "ToStringMethodExample{" +
                "SomeWOrds='" + SomeWOrds + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToStringMethodExample that = (ToStringMethodExample) o;
        return Objects.equals(SomeWOrds, that.SomeWOrds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SomeWOrds);
    }
}
