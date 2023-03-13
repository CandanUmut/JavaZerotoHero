package unit04.iteration.day17;

public class ForLoopsPractice {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=10 ; i=i+2) {
            sum = i+sum;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
