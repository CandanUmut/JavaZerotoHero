package unit06.array.day25.arrayalgorithms;

public class AlgorithmExamples {
    public static void main(String[] args) {

        int[] arr = {31, 3, 123, 124, 123, 43, 46, 47, 4567, 3, 6, 578, 1, 2353456, 4587, 58, 4};

        int min=arr[0];
        getMax(arr);

        for (int num:arr) {
            if(num<min){
                min=num;


            }

        }System.out.println("Minimum number in the array is " + min);

        int max=arr[0];
        for (int nummax:arr
             ) {
            if(nummax>max){
                max=nummax;
            }

        }
        System.out.println("Maximum number in the array is " + max);

    }
    public static int getMax(int[]arr){


        int max=arr[0];
        for (int nummax:arr
        ) {
            if(nummax>max){
                max=nummax;
            }

        }
        System.out.println("Maximum number in the array is " + max);
        return max;

    }

}
