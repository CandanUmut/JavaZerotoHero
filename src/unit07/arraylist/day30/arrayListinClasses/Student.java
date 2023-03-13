package unit07.arraylist.day30.arrayListinClasses;

import java.util.ArrayList;

public class Student {


    private String name;
    private int gradeLevel;
    private ArrayList<Integer> mathGrades;
// Class Methods
    public void addMathGrade(int score){
        mathGrades.add(score);


    }

    public double mathAverage(){
        double average = 0;
        double sum = 0.0;
        for (int score:mathGrades
             ) {
            sum = sum+score;



        }
        average = sum / mathGrades.size();
        return average;




    }


    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.mathGrades = new ArrayList<>();
    }
    public void removeUnderSeventy(){
        for (int i = mathGrades.size()-1; i > 0; i--) {
            if(mathGrades.get(i)<70){
                mathGrades.remove(i);
            }

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public ArrayList<Integer> getMathGrades() {
        return mathGrades;
    }

    public void setMathGrades(ArrayList<Integer> mathGrades) {
        this.mathGrades = mathGrades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", mathGrades=" + mathGrades +
                '}';
    }


}
