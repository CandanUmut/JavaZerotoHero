package unit05.oop.day20.encapsulation;

public class DifferentClass {

    private int privateInt;
    protected int protectedInt;
    public int publicInt;
    int defaultInt;


    public static void main(String[] args) {
        EncapsulationExample a = new EncapsulationExample();
        System.out.println(a.protectedInt);
        System.out.println(a.publicInt);
        System.out.println(a.defaultInt);
        a.publicInt=89;
        System.out.println(a.publicInt);
//        System.out.println(a.privateInt);
    }

}
