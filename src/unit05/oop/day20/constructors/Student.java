package unit05.oop.day20.constructors;

public class Student {
    private String idNumber;
    private String fullName;
    private int age;
    private double gpa;
    private boolean isGratuated;

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.isGratuated);
    }


}
