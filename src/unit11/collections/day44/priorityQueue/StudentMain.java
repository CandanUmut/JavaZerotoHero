package unit11.collections.day44.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StudentMain {
    public static void main(String[] args) {

            Queue<Student> students
                    = new PriorityQueue<>(Comparator.comparing(Student::getAge));

            students.offer(new Student(31,31.5));
            students.offer(new Student(29,31.5));
            students.offer(new Student(26,11.5));
            students.offer(new Student(25,41.5));
            students.offer(new Student(21,51.5));
        System.out.println(students);
        students.poll();
        System.out.println(students);
        students.poll();
        System.out.println(students);


            Queue<Student>students1 = new PriorityQueue<>(Comparator.comparing(Student ::getGpa).reversed());
            students1.offer(new Student(31,31.5));
            students1.offer(new Student(29,31.5));
            students1.offer(new Student(26,11.5));
            students1.offer(new Student(25,41.5));
            students1.offer(new Student(21,51.5));
            students1.poll();
        System.out.println(students1);
        students1.poll();
        System.out.println(students1);









    }
}
