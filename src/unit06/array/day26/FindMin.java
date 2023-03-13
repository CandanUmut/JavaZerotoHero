package unit06.array.day26;

public class FindMin {
    public static void main(String[] args) {
        int[]numbers ={1,22,3,5};
        System.out.println(findMin(numbers));

    }public static int findMin(int[]arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];

            }

        }return min;
    }
}
