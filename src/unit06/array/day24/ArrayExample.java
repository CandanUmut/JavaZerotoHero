package unit06.array.day24;

public class ArrayExample {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int index = findElementIndex(myArray, 3);
        System.out.println(index);





    }public static int findElementIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }


}
