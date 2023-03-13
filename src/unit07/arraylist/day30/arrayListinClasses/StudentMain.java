package unit07.arraylist.day30.arrayListinClasses;

public class StudentMain {
    public static void main(String[] args) {
        Student student1= new Student("umut",20);
        student1.addMathGrade(99);
        student1.addMathGrade(100);
        student1.addMathGrade(67);
        student1.addMathGrade(65);
        System.out.println(student1.getMathGrades());
        System.out.println(student1.mathAverage()+" Math average is ");
        student1.removeUnderSeventy();
        System.out.println(student1.getMathGrades());
        System.out.println(student1.mathAverage());

    }
}
