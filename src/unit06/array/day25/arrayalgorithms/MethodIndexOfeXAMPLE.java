package unit06.array.day25.arrayalgorithms;

public class MethodIndexOfeXAMPLE {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4};
        int maxIndex = findMaxIndex(arr);
        System.out.println(maxIndex);


    }

    public static int findMaxIndex(int[] arr) {
        int maxIndex = 0; // Initialize maxIndex to 0
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                // If current element is greater than max, update maxIndex
                maxIndex = i;
            }
        }
        return maxIndex; // Return the index of the maximum value
    }

}
