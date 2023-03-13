package unit08.array2d.day33;

import java.util.Arrays;

public class ForLoopTraversal {
    public static void main(String[] args) {
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.print((words[i][j]+ " "));


                
            }
            System.out.println();
            
        }

    }
}
