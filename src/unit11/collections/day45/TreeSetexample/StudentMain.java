package unit11.collections.day45.TreeSetexample;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        TreeSet<Student>studentTreeSet= new TreeSet<>(Comparator.comparing(Student::getGpa));
       studentTreeSet.addAll(List.of(new Student("John",3.65),new Student("Mark",3.79),new Student("David", 2.00))) ;

        System.out.println(studentTreeSet);
        System.out.println(studentTreeSet.last());
        System.out.println(studentTreeSet.first());
        System.out.println(studentTreeSet.ceiling(new Student("",3.5)));
        System.out.println(studentTreeSet.higher(new Student("",3.5)));
        System.out.println(studentTreeSet.lower(new Student("", 2.5)));





    }

}
