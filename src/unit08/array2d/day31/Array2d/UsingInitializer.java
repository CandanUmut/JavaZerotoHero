package unit08.array2d.day31.Array2d;

import java.util.Arrays;

public class UsingInitializer {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5, 6};
        int[] num2 = {13123, 21, 33, 4, 25, 1};
        int[] num3 = {12, 23, 43, 41, 53, 6};
        int[] num4 = {141, 24, 3, 4, 15, 1};

        int[][] numbers = {num1, num2, num3, num4};
        System.out.println(Arrays.deepToString(numbers));

        int[][] quizGrades = {{99, 78, 99, 87, 67, 8}, {87, 67, 86, 86}, {98, 89, 89}
        };
        System.out.println(Arrays.deepToString(quizGrades));
        String[][] myWords ={{"Ali", "Ayse"},{"Veli", "Deli"},{"a", "B", "c", "D"}};

        System.out.println(Arrays.deepToString(myWords));
    }
}
