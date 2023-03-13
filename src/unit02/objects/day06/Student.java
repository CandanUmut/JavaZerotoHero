package unit02.objects.day06;

public class Student {
    private  String name;
    private double gpa;
    public Student(String theName, double theGpa){
        name = theName;
        gpa = theGpa;
        System.out.println("Message from the Constructor ");
        System.out.println("A student is created with the name ");
        System.out.println(name);
        System.out.println("The gpa is: " + gpa );
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        Student student1 =new Student("Umut" , 3.76);
        System.out.println("Main will be finalized ");


    }
}
