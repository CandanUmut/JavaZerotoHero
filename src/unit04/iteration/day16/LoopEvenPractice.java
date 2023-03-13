package unit04.iteration.day16;

public class LoopEvenPractice {
    public static void main(String[] args) {
        int number = 1;
        int total = 0;

        while (number <=10){
            number++;
            if (number%2==0){
                total = number+total;
                System.out.println(number);

            }

        }
        System.out.println(total);
    }
}
