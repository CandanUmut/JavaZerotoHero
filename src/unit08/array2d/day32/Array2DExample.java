package unit08.array2d.day32;

import java.util.Arrays;

public class Array2DExample {
    public static void main(String[] args) {
        int[][] numbersArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {11, 12, 13},
                {16, 17},
                {116, 117, 1116, 11117}
        };

        System.out.println(numbersArray[1][2]);
        // Please print 491116 to the screen
        System.out.println(""+numbersArray[0][3]+numbersArray[1][3]);
        //Please print 13117163
        System.out.println(""+numbersArray[2][2]+numbersArray[4][1]+numbersArray[3][0]+numbersArray[0][2]);
        //Please print 11128111171693 to the screen
        System.out.println(numbersArray[2][0] + "" + numbersArray[2][1] + "" + numbersArray[1][2] + "" + numbersArray[4][3] +
                "" + numbersArray[3][0] + "" + numbersArray[1][3] + "" + numbersArray[0][2]);

        //Updating the elements
        numbersArray[1][3] = 99;
        System.out.println(numbersArray[1][3]);


        //Change the 1116 to 6666
        numbersArray[4][2]=6666;
        System.out.println(Arrays.toString(numbersArray[4]));

        //Please use the same code that you printed 13117163 to print 0123
        numbersArray[2][2]=0;
        numbersArray[4][1]=1;
        numbersArray[3][0]=2;
        numbersArray[0][2]=3;
        System.out.println(""+numbersArray[2][2]+numbersArray[4][1]+numbersArray[3][0]+numbersArray[0][2]);
        //Last array last number
        System.out.println(""+numbersArray[numbersArray.length-1][numbersArray[numbersArray.length-1].length-1]);
        //please print the first arrays lengt
        System.out.println(numbersArray[0].length);
        System.out.println(numbersArray[numbersArray.length-1].length);







    }
}
