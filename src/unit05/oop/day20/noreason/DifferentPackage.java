package unit05.oop.day20.noreason;

import unit05.oop.day20.encapsulation.EncapsulationExample;

public class DifferentPackage {
    public static void main(String[] args) {
        EncapsulationExample a = new EncapsulationExample();
//        System.out.println(a.protectedInt);
        System.out.println(a.publicInt);
//        System.out.println(a.defaultInt);
        a.publicInt=89;
        System.out.println(a.publicInt);
//       System.out.println(a.privateInt);
    }
}
