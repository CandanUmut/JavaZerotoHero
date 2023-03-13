package unit11.collections.day43.sortinglistComperable;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private Double GPA;

    public Student(Double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        return this.GPA.compareTo(that.GPA);
    }
}
