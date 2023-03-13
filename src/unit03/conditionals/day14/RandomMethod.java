package unit03.conditionals.day14;

import java.util.Random;

public class RandomMethod {
    public static void main(String[] args) {
        Random dice = new Random();
        int dice1 =dice.nextInt(1,7);
        System.out.println(dice1);
    }
}
