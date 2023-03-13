package unit02.objects.day08;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Umut", 25,90);
        double averageGrade = student1.getAverage();

        System.out.println("Student name is "+student1.getName()+" has an average of "  + student1.getAverage()+" points");


    }

}
