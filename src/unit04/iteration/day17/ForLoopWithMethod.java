package unit04.iteration.day17;

public class ForLoopWithMethod {
    public static void main(String[] args) {

        System.out.println(sumOfNumber(100000000));
        printHelloJavaNtimes(16);
        getNumbers(6);


    }

    public static int sumOfNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = i + sum;
//            System.out.println(i);


        }
        return sum;
    }

    public static void printHelloJavaNtimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello Java");

        }


    }

    public static void getNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");


        }
    }
}

