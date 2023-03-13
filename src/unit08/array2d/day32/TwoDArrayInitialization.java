package unit08.array2d.day32;

import java.util.Arrays;

public class TwoDArrayInitialization {
    public static void main(String[] args) {
        /*Create a 2D String Array with favorite fruits

         */

        String [][] fruits= new String[3][];
        String[]word0={"Banana"};
        String[]word1={"Strawberry"};
        String[]word2={"Watermelon"};
        fruits[0]=word0;
        fruits[1]=word1;
        fruits[2]=word2;
        System.out.println(Arrays.deepToString(fruits));

        //Orrr;
        String [][] favFruits= {{"Apple","banana"},{"Strawberry", "kiwi"},{"pineapple"}};
        System.out.println(Arrays.deepToString(favFruits));
        System.out.println(favFruits.length);
        System.out.println("the length of the 2D arrays index0 array is " + favFruits[0].length);


    }

}
