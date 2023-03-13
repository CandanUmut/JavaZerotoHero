package unit06.array.day24;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        int []array= {1,3,5,7};
        printArray(array);
        printArrayReverse(array);


    }

    public static void printArray(int[] arr){
        for (int i = 0; i< arr.length ; i++) {
            System.out.println(arr[i]);

        }

    }
    public static void printArrayReverse(int[]arr){
        Scanner scanner= new Scanner(System.in);
        for(int i= arr.length-1; i>=0;i--){
            arr[i]= scanner.nextInt();
            System.out.print(arr[i]);
        }
    }
}
