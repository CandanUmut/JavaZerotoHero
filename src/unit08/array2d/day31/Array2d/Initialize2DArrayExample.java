package unit08.array2d.day31.Array2d;

import java.util.Arrays;

public class Initialize2DArrayExample {
    public static void main(String[] args) {
        String [][] words= new String[2][2];
        String[]word0={"John", " doe"};
        String[]word1={"Umut","Candan"};
        words[0]=word0;
        words[1]=word1;
        System.out.println(Arrays.deepToString(words));

    }



}
