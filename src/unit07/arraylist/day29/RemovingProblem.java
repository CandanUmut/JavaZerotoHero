package unit07.arraylist.day29;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingProblem {
    public static void main(String[] args) {
        ArrayList<Integer> problem = new ArrayList<>(Arrays.asList(120,300,53,23,123));
        System.out.println("before removal" + problem);
        for (int i = problem.size()-1; i > 0 ; i--) {
            if(problem.get(i)<100){
                problem.remove(i);

            }

        }
        System.out.println("After removal " + problem);
    }
}
