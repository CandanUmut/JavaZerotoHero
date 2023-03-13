package unit05.oop.day23.MultipleClasses;

public class MainClass {
    public static void main(String[] args) {
        Address adress1= new Address("242 Miller","Miller place","NY","11764");
        Student student1=new Student("John Doe",4.0,adress1);
        System.out.println(student1.getAddress());
        Address address2 = new Address("242 Miller","Miller place","California","11764");
        System.out.println(student1.isSameState(address2));
    }
}
