package unit07.arraylist.day30.linearSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        Student student1= new Student("John Doe", "JD2201");
        Student student2 = new Student("Jackie Jane", "JJ2202");
        Student student3 = new Student("Bryan Schmitt", "BS2203");
        ArrayList<Student> classroom = new ArrayList<>(Arrays.asList(student1,student2,student3));

        System.out.println(classroom);
        System.out.println(findStudent(classroom,"JJ2202"));

    }
    public static int findStudent(ArrayList<Student>students,String id){
        int a = -1;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                a = students.indexOf(students.get(i));
            }

        }
        return a;
    }
    }

