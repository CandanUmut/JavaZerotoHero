package unit11.collections.day44.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class StudentSetExample {
    public static void main(String[] args) {
        Set<Student> studentSets = new HashSet<>();
        studentSets.add(new Student("John",15));
        studentSets.add(new Student("John",25));
        System.out.println(studentSets);
        studentSets.add(new Student("John",15));
        System.out.println(studentSets);
    }
}
