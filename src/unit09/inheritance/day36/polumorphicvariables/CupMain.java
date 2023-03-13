package unit09.inheritance.day36.polumorphicvariables;

public class CupMain {
    public static void main(String[] args) {
        Cup teacup = new TeaCup();
        Cup turkishtea = new Cup();

        System.out.println(teacup instanceof Cup);

    }
}
