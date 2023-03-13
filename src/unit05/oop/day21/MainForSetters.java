package unit05.oop.day21;

public class MainForSetters {
    public static void main(String[] args) {
        Car car1=new Car("White", 200,2022);
        car1.setColor("bok");
        System.out.println(car1);
        Student student1= new Student("aaaa","umut",3.99);

        student1.setGpa(2.99);
        student1.setId("1999");
        student1.setName("Ahmet");
        System.out.println(student1);

    }


}
