package unit05.oop.day21;

public class StudentMain {
    public static void main(String[] args) {
        Student student1=new Student("22211","John doe",3.96);
        System.out.println(student1.getId());

        Car car1=new Car("Yellow",2021,300);

        Car car2=new Car("Blue", 1993,156975);

        System.out.println("Car1 mileage is "+car1.getMileage());
        System.out.println("Car2 mileage is "+car2.getMileage() );
        System.out.println(car1);



    }
}
