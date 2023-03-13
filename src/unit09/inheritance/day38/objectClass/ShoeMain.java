package unit09.inheritance.day38.objectClass;

public class ShoeMain {
    public static void main(String[] args) {
        Shoe shoe1= new Shoe(8, "Blue");
        Shoe shoe2= new Shoe(9,"Red");
        Shoe shoe3= new Shoe(8,"Blue");

        System.out.println(shoe1.equals(shoe3 ));

        Shoe sportShoe = new SportShoe(8, "white","Soccer");
        Shoe sportShoe1 = new SportShoe(8, "white","Basketball");
        Shoe sportShoe2 = new SportShoe(8, "white","Soccer");
        System.out.println(sportShoe.equals(sportShoe1));


    }
}
