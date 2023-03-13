package unit03.conditionals.day14;

public class MathClub {

    public static void main(String[] args) {
        double gpa = 3.5;
        String grade= "B";

        if (gpa>=3.0 || grade.equals("A")){
            System.out.println("You can join the math clup");

        }else {
            System.out.println("you cannot join the math clup");
        }
    }
}
