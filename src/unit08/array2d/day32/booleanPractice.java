package unit08.array2d.day32;

import java.util.Arrays;

public class booleanPractice {
    public static void main(String[] args) {
        boolean[][] booleans = new boolean[3][4];
        booleans[0][2]=true;
        booleans[2][1]=true;

        System.out.println(Arrays.deepToString(booleans));

        String[][] letters = {{"a", "b", "c", "d", "e"},
                {"f", "g", "h", "i", "j"},
                {"k", "l", "m", "n", "o"},
                {"p", "q", "r", "s", "t"},
                {"u", "v", "w", "x", "y"} };

        String a= (letters[3][3]+letters[0][3]+letters[0][4]+letters[3][4]);
        System.out.println(a.toUpperCase());
        letters[3][3]="B";
        letters[0][3]="E";
        letters[0][4]="S";
        letters[3][4]="T";
        String b = (letters[3][3]+letters[0][3]+letters[0][4]+letters[3][4]);
        System.out.println(b);


    }
}
