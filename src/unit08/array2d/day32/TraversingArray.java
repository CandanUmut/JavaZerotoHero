package unit08.array2d.day32;

import java.util.Arrays;

public class TraversingArray {
    public static void main(String[] args) {
        int[][] twoDNumbers = {
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
                {26,27,28,29,30},
        };

//        for (int row = 0; row < twoDNumbers.length; row++) {
//            for (int column = 0; column < twoDNumbers[row].length ; column++) {
//                System.out.print(twoDNumbers[row][column]+ " ");
//
//
//            }
//            System.out.println();



//        }
        for (int[] row : twoDNumbers) {
//            System.out.println(Arrays.toString(row));
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
