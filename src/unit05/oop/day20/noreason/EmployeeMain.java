package unit05.oop.day20.noreason;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee("Mehmet",90000,true,"Mehmet");

        System.out.println(employee1);
        System.out.println(employee2);

        Car car1= new Car();
        System.out.println(car1);
        Car car2= new Car("Yellow",2010,10000);
        System.out.println(car2);
        System.out.println(employee2.getColor());

    }

}
