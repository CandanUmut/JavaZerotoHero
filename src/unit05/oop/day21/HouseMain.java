package unit05.oop.day21;

public class HouseMain {
    public static void main(String[] args) {
        House house1= new House("Blue","Main Avenu", 30000);
        House house2= new House("Yellow","Hain Avenu", 11130000);

        System.out.println(house1);
        System.out.println(house2);
        house1.setAddress("Miller Plave|");
        System.out.println(house1);

    }


}
