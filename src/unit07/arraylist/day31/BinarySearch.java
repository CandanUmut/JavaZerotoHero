package unit07.arraylist.day31;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        int index = BinarySearch.binarySearch(array, key);

        if (index == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key found at index " + index);
        }

    }
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;

    }


}

