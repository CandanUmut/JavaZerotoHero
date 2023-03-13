package unit06.array.day25;

public class RandomArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 1, 24, 53, 123};
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.println(num);

            }

        }
        int[] arr1 = {1, 2, 3, 4, 5, 6, 8, 1, 24, 53, 123};
        for (int num : arr1) {
            if (num % 2 == 0) {
                System.out.print(num + " ");

            }


        }
    }
}
