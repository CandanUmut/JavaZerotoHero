package unit08.array2d.day33;

import java.util.Arrays;

public class TwoDArrayAsaParameter {
    public static void main(String[] args) {
        int[][] twoDNumbers = {
                {11,12,13,14,},
                {16,17,18,19,20},
                {21,22,23},
                {26,27,28,29},
        };
        printthe2DArray(twoDNumbers);


        System.out.println(Arrays.deepToString(create2DArray()));




    }
    public static void printthe2DArray(int[][]arr){
        System.out.println(Arrays.deepToString(arr));

    }
    public static String[][] create2DArray(){
        String[][] array = new String[3][4];
        return array;
    }
}
