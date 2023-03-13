package unit05.oop.day24;

public class HomeworkMain {
    public static void main(String[] args) {
        Homework homework1 = new Homework("math1", 100);
        System.out.println(Homework.getNumOfHWs());

        Homework homework2 = new Homework("math2", 100);
        Homework homework3 = new Homework("math3", 100);
        System.out.println(Homework.getNumOfHWs());


    }
}
