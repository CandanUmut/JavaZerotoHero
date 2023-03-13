package unit06.array.day27;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
        printArr(array);


    }
    public static void printArr(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
