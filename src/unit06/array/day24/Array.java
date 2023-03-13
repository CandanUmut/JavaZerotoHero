package unit06.array.day24;

public class Array {
    public static void main(String[] args) {
        int[] numberArray = new int[5];
        numberArray[numberArray.length - 1] = 50;
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numberArray[numberArray.length - 1]);
        printFirstElement(numberArray);
        printFirstElement(numbers);
        int[]arr3 = createArray();
        printFirstElement(arr3);

    }


    public static void printFirstElement(int[] numbers) {
        System.out.println(numbers[0]);

    }public static int[] createArray(){
        int[] arr= {20, 30,40};

        return arr;
    }


}