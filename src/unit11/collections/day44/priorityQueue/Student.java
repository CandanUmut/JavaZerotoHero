package unit11.collections.day44.priorityQueue;

public class Student {
    private int Age;
    private double Gpa;

    public Student(int age, double gpa) {
        Age = age;
        Gpa = gpa;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getGpa() {
        return Gpa;
    }

    public void setGpa(double gpa) {
        Gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Age=" + Age +
                ", Gpa=" + Gpa +
                '}';
    }
}
