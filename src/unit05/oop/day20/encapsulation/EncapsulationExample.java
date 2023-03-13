package unit05.oop.day20.encapsulation;

public class EncapsulationExample {
    private int privateInt;
    protected int protectedInt;
    public int publicInt;
    int defaultInt;


    public static void main(String[] args) {
        EncapsulationExample a = new EncapsulationExample();
        System.out.println(a.protectedInt);
    }

}
