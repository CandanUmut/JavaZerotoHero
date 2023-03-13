package unit01.primitive.types.day03;

public class QuickReviewday02 {
    public static void main(String[] args) {
        int currentYear;
        currentYear = 2022;
        currentYear = 2023243;
        System.out.println(currentYear);
        //currentYear = 2.5; you cant assing double to an integer !!
        //double and floats are decimal numbers
        //boolean is (true or false)
        // variables cant start with uppercase and numbers cannot be at the beginning
        //camelCase!!
        final double PI;
        PI = 3.14 ;
// Syntax errors are grammar errors , logic errors are ,
        // if you use final variable you can't change it later;
        //modulus operator % it shows you the remainder;
        int evenOrOdd = currentYear%2;

        int x = 4%2;
        System.out.println(x);
        System.out.println(PI);
        x=5%2;
        System.out.println(x);

    }
}
