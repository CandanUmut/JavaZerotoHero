package unit04.iteration.day19;

public class Challenge {

    public static void main(String[] args) {
        for (int i = 5; i > 0; i--){
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}