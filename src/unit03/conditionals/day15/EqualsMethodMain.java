package unit03.conditionals.day15;

import unit02.objects.day07.Rectangle;

public class EqualsMethodMain {
    public static void main(String[] args) {
        EqualsMethod r1 = new EqualsMethod(3,5);
        EqualsMethod r2 = new EqualsMethod(3,5);

        if (r1.equals(r2)){
            System.out.println("This rectangles have same values with each other");
        }else {
            System.out.println("They don't have same values");
        }
    }
}
